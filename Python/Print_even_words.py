sentence = "sky is vast and beautiful. Colour is blue"
wordArray = sentence.split(" ")
for word in wordArray:
    if len(word) %2 == 0:
        print(word)