import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashTagRanking {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(
				"Please enter the tweet, \nif you want to stop the program execution please type \"exit\" and press enter.");
		String str;
		System.out.print("Tweet: ");
		HashMap<String, Integer> hashTags = new HashMap<>();
		while (!(str = br.readLine()).equals("exit")) {
			System.out.print("Tweet: ");
			int startIndex = 0;
			while ((startIndex = str.indexOf("#", startIndex)) != -1) {
				int endIndex = str.indexOf(' ', startIndex);
				String hashTag = "";
				if (endIndex == -1) {
					hashTag = str.substring(startIndex + 1);
					startIndex = str.length();
				} else {
					hashTag = str.substring(startIndex + 1, endIndex);
					startIndex = endIndex;
				}
				hashTag = hashTag.toLowerCase();
				if (hashTag.length() != 0) {
					if (hashTags.containsKey(hashTag)) {
						hashTags.put(hashTag, hashTags.get(hashTag) + 1);
					} else {
						hashTags.put(hashTag, 1);
					}
				}
			}
		}
		List<Map.Entry<String, Integer>> topHashTags = getTopHashTags(hashTags);
		if (topHashTags.size() >= 1) {
			System.out.println("----- TOP " + topHashTags.size() + " Hash Tags");
			for (int i = 0; i < topHashTags.size(); i++) {
				System.out.println(topHashTags.get(i).getKey());
			}
		} else {
			System.out.println("No Hash Tags found.");
		}

	}

	public static List<Map.Entry<String, Integer>> getTopHashTags(HashMap<String, Integer> hashTags) {
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hashTags.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		if (list.size() >= 10) {
			return list.subList(0, 10);
		} else {
			return list;
		}
	}
}
