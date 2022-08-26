public class patika_dev_Dizideki_Eleman_Frekansi {
    public static void main(String[] args) {
        int[] numbers = {5,4,2,8,7,6,5,2,5,6,7,2,6,4,4};
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2 == 0) {
                int count = 1;
                boolean evenCheck = false;
                for (int j = i + 1; j < numbers.length; j++) {
                    if (numbers[i] == numbers[j]) {
                        count++;
                        evenCheck = true;
                    }
                }
                if(evenCheck){
                    boolean writeCheck = true;
                    for(int a = i-1; a>=0; a--){
                        if(numbers[i] == numbers[a]){
                            writeCheck = false;
                        }
                    }
                    if(writeCheck){
                        System.out.println(numbers[i]+" sayisi "+count+" kere tekrar edildi.");
                    }
                }
            }
        }
    }
}
