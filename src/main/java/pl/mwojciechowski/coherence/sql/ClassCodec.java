package pl.mwojciechowski.coherence.sql;

import com.tangosol.io.pof.PofReader;
import com.tangosol.io.pof.PofWriter;
import com.tangosol.io.pof.reflect.Codec;

import java.io.IOException;

/**
 * @author Michal Wojciechowski
 */
public class ClassCodec implements Codec {

    @Override
    public Object decode(PofReader pofReader, int i) throws IOException {
        String className = pofReader.readString(i);
        Class<?> result;
        try {
            result = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    @Override
    public void encode(PofWriter pofWriter, int i, Object o) throws IOException {
        pofWriter.writeString(i, ((Class<?>) o).getName());
    }
}
