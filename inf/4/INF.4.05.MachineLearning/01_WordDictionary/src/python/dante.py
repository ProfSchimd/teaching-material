import requests
import re

def preprocess(text):
    return re.sub('[^A-zÀ-ú]+', ' ', text).lower()

def get_text(text_url):
    r = requests.get(text_url, allow_redirects=True)
    return r.text

text_url = 'https://dmf.unicatt.it/~della/pythoncourse18/commedia.txt'
text = preprocess(get_text(text_url))
print(text[50:300])