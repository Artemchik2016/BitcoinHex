import com.google.common.hash.Hashing;
import org.bitcoinj.core.Address;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.params.MainNetParams;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        ECKey key = ECKey.fromPrivate(sha256("1231").getBytes());
        Address addressFromKey = key.toAddress(MainNetParams.get());
        System.out.println(key.getPrivateKeyEncoded(MainNetParams.get()));
        System.out.println(addressFromKey);
    }


    private static String sha256(String original) {
        String s =  Hashing.sha256()
                 .hashString(original, StandardCharsets.UTF_8)
                 .toString();
        System.out.println(s);
        return s;
    }



}
