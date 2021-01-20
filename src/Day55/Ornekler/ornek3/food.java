package Day55.Ornekler.ornek3;

public abstract class food
    {
        private String name;
        public abstract void madeIN();
        public abstract void taste();

        @Override
        public String toString() {
            return "food{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
