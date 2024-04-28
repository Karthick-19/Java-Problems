package Java;

import java.util.PriorityQueue;
import java.util.HashMap;

class HuffmanNode implements Comparable<HuffmanNode> {
    char ch;
    int freq;
    HuffmanNode left, right;

    public HuffmanNode(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
        left = right = null;
    }

    @Override
    public int compareTo(HuffmanNode node) {
        return this.freq - node.freq;
    }
}

public class HuffmanCoding {
    static HashMap<Character, String> encode = new HashMap<>();
    static HashMap<String, Character> decode = new HashMap<>();

    static void encode(HuffmanNode root, String str) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            encode.put(root.ch, str);
            decode.put(str, root.ch);
        }
        encode(root.left, str + "0");
        encode(root.right, str + "1");
    }

    static void buildHuffmanTree(String text) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char ch : text.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>();
        for (var entry : freqMap.entrySet()) {
            pq.offer(new HuffmanNode(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.poll();
            HuffmanNode right = pq.poll();
            HuffmanNode merged = new HuffmanNode('$', left.freq + right.freq);
            merged.left = left;
            merged.right = right;
            pq.offer(merged);
        }

        HuffmanNode root = pq.peek();
        encode(root, "");
    }

    static String compress(String text) {
        StringBuilder encodedText = new StringBuilder();
        for (char ch : text.toCharArray()) {
            encodedText.append(encode.get(ch));
        }
        return encodedText.toString();
    }

    static String decompress(String encodedText) {
        StringBuilder decodedText = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (char bit : encodedText.toCharArray()) {
            temp.append(bit);
            if (decode.containsKey(temp.toString())) {
                decodedText.append(decode.get(temp.toString()));
                temp.setLength(0);
            }
        }
        return decodedText.toString();
    }

    public static void main(String[] args) {
        String text = "Huffman coding is a data compression algorithm";
        buildHuffmanTree(text);
        String encodedText = compress(text);
        System.out.println("Encoded Text: " + encodedText);
        String decodedText = decompress(encodedText);
        System.out.println("Decoded Text: " + decodedText);
    }
}

