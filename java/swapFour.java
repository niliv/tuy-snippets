/**四位数 1和4位对调，2和3位对调 */
int temp;
int a[] = new int[4];
a[0] = num / 1000; // 取千位的数字
a[1] = (num/100)%10; //取百位的数字
a[2] = (num/10)%10; //取十位的数字
a[3] = num%10;   //取个位的数字

//1和4位交换 2和3位交换
for(int j=0;j<=1;j++){
    temp =a[j];
    a[j] = a[3-j];
    a[3-j] =temp;
}