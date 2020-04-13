public class loop {
    public static void main(String[] args) {
        char array[] = new char[6];
        for (char c0 = 'a'; c0 <= 'z'; c0++) {
            array[0] = c0;
            for (char c1 = 'a'; c1 <= 'z'; c1++) {
                array[1] = c1;
                for (char c2 = '0'; c2 <= '9'; c2++) {
                    array[2] = c2;
                    for (char c3 = '0'; c3 <= '9'; c3++) {
                        array[3] = c3;
                        for (char c4 = '0'; c4 <= '9'; c4++) {
                            array[4] = c3;
                            for (char c5 = '0'; c5 <= '9'; c5++) {
                                array[5] = c5;
                                String s = new String(array);
                                System.out.println(s);
                            }
                        }

                    }
                }
            }
        }

    }

}
