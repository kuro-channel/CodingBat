import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	}

	//	Modify and return the given map as follows: if the key "a" has a value,
	//	set the key "b" to have that value, and set the key "a" to have the value "".
	//	Basically "b" is a bully, taking the value and replacing it with the empty string.
	//
	//	mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
	//	mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
	//	mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
	public Map<String, String> mapBully(Map<String, String> map) {
		// aにvalueが設定してある場合、aのvalueをbに、aのvalueを""とする
		if(map.containsKey("a")){
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;
	}

	//	Modify and return the given map as follows: if the key "a" has a value, set the key "b"
	//	to have that same value. In all cases remove the key "c", leaving the rest of
	//	the map unchanged.
	//
	//	mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
	//	mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
	//	mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
	public Map<String, String> mapShare(Map<String, String> map) {
		// key:aがvalueを有する場合、b以降のkeyのvalueをaのvalueとする
		// key:cがあった場合はremoveする
		if(map.containsKey("a")){
			map.put("b", map.get("a"));
		}
		if(map.containsKey("c")){
			map.remove("c");
		}
		return map;
	}

	//	Modify and return the given map as follows: for this problem the map may or may not
	//	contain the "a" and "b" keys. If both keys are present, append their 2 string values
	//	together and store the result under the key "ab".
	//
	//	mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
	//	mapAB({"a": "Hi"}) → {"a": "Hi"}
	//	mapAB({"b": "There"}) → {"b": "There"}
	public Map<String, String> mapAB(Map<String, String> map) {
		
	}
}
