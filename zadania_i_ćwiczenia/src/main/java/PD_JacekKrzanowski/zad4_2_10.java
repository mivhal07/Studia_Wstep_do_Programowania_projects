package PD_JacekKrzanowski;

public class zad4_2_10 {

    public static void main(String[] args) {
        int[] tab = {1, -180, 0, -20, 7, 9, -3, 16, 40, -5};

        System.out.println("A: " + maxValue(0, tab));
        System.out.println("B: " + minValue(0, tab));
        System.out.println("C: " + maxIndex(0, tab));
        System.out.println("D: " + minIndex(0, tab));
        System.out.println("E: " + maxAbsoluteValue(0, tab));
        System.out.println("F: " + maxAbsoluteIndex(0, tab));
    }

    // A
    public static int maxValue(int a, int[] tab) {
        int max = tab[0];
        for (int j : tab) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }

    // B
    public static int minValue(int a, int[] tab) {
        int min = tab[0];
        for (int i = tab.length - 1; i >= 0; i--) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        return min;
    }

    //C
    public static int maxIndex(int a, int[] tab) {
        int index = 0;
        int max = tab[0];
        for (int j : tab) {
            if (j > max) {
                max = j;
            }
        }
        for (int i : tab) {
            index++;
            if (i == max) {
                break;
            }
        }
        return index - 1;
    }

    // D
    public static int minIndex(int a, int[] tab) {
        int index = 0;
        int min = tab[0];
        for (int j : tab) {
            if (j < min) {
                min = j;
            }
        }
        for (int i : tab) {
            index++;
            if (i == min) {
                break;
            }
        }
        return index - 1;
    }

    // E
    public static int maxAbsoluteValue(int a, int[] tab) {
        int result = 0;
        int max = tab[0];
        for (int j : tab) {
            if (j > max) {
                max = j;
            }
        }
        int min = tab[0];
        for (int i = tab.length - 1; i >= 0; i--) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        if (min < 0) {
            result = min * (-1);
        }
        if (result > max) {
            max = result;
        }
        return max;
    }

    // F
    public static int maxAbsoluteIndex(int a, int[] tab) {
        int index = 0;
        int result = 0;
        int max = tab[0];
        for (int j : tab) {
            if (j > max) {
                max = j;
            }
        }
        int min = tab[0];
        for (int i = tab.length - 1; i >= 0; i--) {
            if (tab[i] < min) {
                min = tab[i];
            }
        }
        if (min < 0) {
            result = min * (-1);
        }
        if (result > max) {
            max = result;
        }
        for (int i : tab) {
            index++;
            if (i == result || i == -result) {
                break;
            }
        }
        return index - 1;
    }
}
