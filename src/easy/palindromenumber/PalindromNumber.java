package easy.palindromenumber;

public class PalindromNumber {
    public int makePowerOfTen(int cnt) {
        int i = 1;
        int ret = 1;

        for(i = 0; i < cnt; i++)
        {
//            System.out.println("ret : " + ret);
            ret *= 10;
        }
        return ret;
    }

    public boolean isPalindrome(int x) {
        int i;
        int cntX = 1;
        int ten = 10;
        int powerOfTen1 = 0;
        int powerOfTen2 = 0;
        int num1, num2 = 0;

        // 1. x가 음수일 경우 false
        if(x < 0)
            return false;

        // 2. x가 0일 경우 true
        if(x == 0)
            return true;
        
        // 3. x의 자리수를 구하기
        while(true)
        {
            if(x / ten == 0)
                break;

            ten *= 10;
            cntX++;

            if(cntX == 10) // 약 21억을 넘는 수는 없기 때문에 10억보다 크면 총 길이는 10이다.
                break;
        }
        
//        System.out.println("cntX : " + cntX);
        
        // 4. 한 자리수일 경우 true
        if(cntX == 1)
            return true;

        powerOfTen1 = makePowerOfTen(cntX - 1);
        powerOfTen2 = makePowerOfTen(1);

        // 5. 맨 앞에 수와 맨 뒤 수를 하나씩 비교하기
        for(i = 0; i < (cntX / 2); i++)
        {
//            System.out.println("i : " + i);
            if(i == 0) // 첫 번째는 나누기와 나머지를 한번씩만 해도 비교 가능
            {
                num1 = x / powerOfTen1;
                num2 = x % powerOfTen2;
            }
            else // 두 번째 부터는 나머지와 나누기를 한번씩 더 해서 비교
            {
                num1 = x % (powerOfTen1 * 10) / powerOfTen1;
                num2 = x % powerOfTen2 / (powerOfTen2 / 10);
            }

//            System.out.println("powerOfTen1 : " + powerOfTen1);
//            System.out.println("powerOfTen2 : " + powerOfTen2);
            
//            System.out.println(num1);
//            System.out.println(num2);

            // x와 y를 비교하여 같으면 true
            if(num1 != num2)
                return false;

            powerOfTen1 /= 10;
            powerOfTen2 *= 10;
        }
        
        return true;
    }
}
