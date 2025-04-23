import json
import pandas as pd

# مسیر فایل Yelp دانلودشده
input_file = 'data/raw/yelp_academic_dataset_review.json'
output_file = 'data/processed/yelp_reviews.csv'

# خواندن فقط چند هزار رکورد برای تست (در صورت کمبود RAM)
limit = 50000

texts = []
labels = []

with open(input_file, encoding='utf-8') as f:
    for i, line in enumerate(f):
        if i == limit:
            break
        review = json.loads(line)
        texts.append(review['text'])
        # ستاره‌های 4 و 5 = مثبت، 1 و 2 = منفی، 3 = خنثی یا حذف
        if review['stars'] >= 4:
            labels.append(1)
        elif review['stars'] <= 2:
            labels.append(0)
        else:
            continue  # حذف امتیاز 3

df = pd.DataFrame({'text': texts, 'label': labels})
df.to_csv(output_file, index=False)
print(f"Saved {len(df)} records to {output_file}")
