public class Phone {
        private int number;
        private String model;
        private int weight;

        public Phone(){
        }
        public Phone(int number, String model){
            this.model=model;
            this.number=number;
        }
        public Phone(int number, String model, int weight){
            this(number, model);
            this.weight=weight;
        }
        void receiveCall (String nameCall){
            System.out.println("Звонит " + nameCall);
        }
        void receiveCall (String nameCall, int phoneNumber){
            System.out.println("Звонит " + nameCall+ ", номер телефона: "+ phoneNumber );
        }
        void sendMessage(int ... phoneNumbers){
            System.out.println("На эти номера будет отправлено сообщение: ");
            for (int val: phoneNumbers){
                System.out.println(val + " ");
            }
        }
        public int getNumber(){
            return number;
        }
        public int getWeight(){
            return weight;
        }
        public String getModel(){
            return model;
        }

}
