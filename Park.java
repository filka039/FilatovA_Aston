public class Park {
    private Attraction attraction;

    public class Attraction{
        private String attractionInfo;
        private String workTime;
        private int price;


        Attraction(String attractionInfo, String workTime, int price){
            this.attractionInfo = attractionInfo;
            this.workTime = workTime;
            this.price = price;
        }

        public void getAttracionInfo() {
            System.out.printf("Информация об аттракционе: %s \nВремя работы: %s \nСтоимость: %d\n",
                    attractionInfo, workTime, price);
        }
    }




}
