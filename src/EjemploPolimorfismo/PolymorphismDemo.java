package EjemploPolimorfismo;

import java.util.HashMap;
import java.util.Map;
//mas info https://www.adictosaltrabajo.com/2019/07/23/el-polimorfismo-es-la-clave/
public class PolymorphismDemo {

    public static final void main(String[] args) {
        String plainText = args[0];
        Algorithm algorithm = Algorithm.valueOf(args[1]);

        EncryptionStrategy encryptionStrategy = EncryptionStrategyFactory.getInstance(algorithm);

        String encryptedText = encryptionStrategy.encrypt(plainText);

        System.out.println(
            String.format("Text encrypted using '%s' algorithm: %s", 
                algorithm, encryptedText)
        );
    }

    enum Algorithm {
        AES, TWOFISH
    }

    interface EncryptionStrategy {
        String encrypt(String input);
    }

    static class EncryptionStrategyFactory {

        public static Map<Algorithm, EncryptionStrategy> encryptionStrategies = new 
            HashMap<Algorithm, EncryptionStrategy>();

        static {
            registerStrategy(Algorithm.AES, (input) -> "aes:" + input);
            registerStrategy(Algorithm.TWOFISH, (input) -> "twofish:" + input);
        }

        public static EncryptionStrategy getInstance(Algorithm name) {
            return encryptionStrategies.get(name);
        }

        public static void registerStrategy(Algorithm algorithm, EncryptionStrategy encryptionStrategy) {
            encryptionStrategies.put(algorithm, encryptionStrategy);
        }

    }

}