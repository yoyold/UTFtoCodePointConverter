package utfconverter;

import java.io.UnsupportedEncodingException;
public class UTFtoCodePointConverter {public static int convertToCodePoint(String utfCharacter) throws UnsupportedEncodingException {
    byte[] utf8Bytes = utfCharacter.getBytes("UTF-8");
    if (utf8Bytes.length == 1) {
        return utf8Bytes[0];
    } else if (utf8Bytes.length == 2) {
        return ((utf8Bytes[0] & 0x1F) << 6) + (utf8Bytes[1] & 0x3F);
    } else if (utf8Bytes.length == 3) {
        return ((utf8Bytes[0] & 0xF) << 12) + ((utf8Bytes[1] & 0x3F) << 6) + (utf8Bytes[2] & 0x3F);
    } else if (utf8Bytes.length == 4) {
        return ((utf8Bytes[0] & 0x7) << 18) + ((utf8Bytes[1] & 0x3F) << 12)
                + ((utf8Bytes[2] & 0x3F) << 6) + (utf8Bytes[3] & 0x3F);
    } else {
        throw new UnsupportedEncodingException("Invalid UTF-8 Character");
    }
}
}
