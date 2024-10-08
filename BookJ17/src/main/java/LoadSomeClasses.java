public class LoadSomeClasses {
    public static class SadClassloader extends ClassLoader {
        public SadClassloader() {
            super(SadClassloader.class.getClassLoader());
        }
        public Class<?> findClass(String name) throws
                ClassNotFoundException {
            System.out.println("Мне очень жаль, но боюсь, что мне не удается найти класс");
            throw new ClassNotFoundException(name);
        }
    }
    public static void main(String[] args) {
        if (args.length > 0) {
            var loader = new SadClassloader();
            for (var name : args) {
                System.out.println(name +" ::");
                try {
                    var clazz = loader.loadClass(name);
                    System.out.println(clazz);
                } catch (ClassNotFoundException x) {
                    x.printStackTrace();
                }
            }
        }
    }
}


