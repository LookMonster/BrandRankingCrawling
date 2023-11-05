import numpy as np
import matplotlib.pyplot as plt

# 브랜드 순위 데이터
brands = [
    "Nike", "Louis Vuitton", "Chanel", "Gucci", "Adidas", "Hermès", "Dior",
    "Cartier", "Zara", "Rolex", "H&M", "UNIQLO", "Tiffany & Co", "Coach",
    "Chow Tai Fook", "Lululemon", "Burberry", "Prada", "Puma", "Omega",
    "Ralph Lauren", "Yves Saint Laurent", "Ray-Ban", "Armani", "Victoria's Secret",
    "Anta", "Under Armour", "The North Face", "Moncler", "Levi's", "Givenchy",
    "Skechers", "Old Navy", "Fila", "Céline", "TAG Heuer", "Tommy Hilfiger",
    "Michael Kors", "Van Cleef & Arpels", "Bulgari", "Primark / Penney's", "Li Ning",
    "Pou Chen", "Calvin Klein", "Lao Feng Xiang", "Loewe", "Bosideng", "Pandora", "Bottega Veneta", "New Balance"
]

# 순위 데이터 (예시 데이터, 실제 데이터로 교체 필요)
rankings = [i for i in range(1, len(brands) + 1)][::-1]

# 그래프 생성
plt.figure(figsize=(10, 12))
plt.barh(brands, rankings, color='skyblue')
plt.xlabel('Ranking')
plt.title('Brand Rankings')
plt.gca().invert_yaxis()  # 높은 랭킹이 위로 올라오도록 설정

# 그리드 라인 추가
plt.grid(axis='x', linestyle='--', alpha=0.7)

# 순위 숫자 표시
for i, v in enumerate(rankings):
    plt.text(v + 0.5, i, str(v), color='blue', fontsize=10, va='center')

plt.show()
