public class Codec {

    // Encodes a URL to a shortened URL.
    HashMap<Integer, String> map = new HashMap<>();
    int n = 1;
    public String encode(String longUrl) {
        map.put(n,longUrl);
            n++;
        return Integer.toString(n-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl)); 
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));