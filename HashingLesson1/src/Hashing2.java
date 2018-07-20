import java.security.MessageDigest;

public class Hashing2 {
	public static String sha256(String base) {
	    try{
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(base.getBytes("UTF-8"));
	        StringBuffer hexString = new StringBuffer();

	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }

	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sha256("Billy"+"bi"));
//bc215b42b57c47ef7b170e0e0d797899118607f27adf25fae918065261870881
//158ad08a164abcab69670683cda2a6af33e4a5146d04d12b596d81d99f778d67
	}

}
