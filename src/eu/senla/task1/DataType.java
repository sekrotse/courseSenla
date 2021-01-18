package eu.senla.task1;

public class DataType {
    private byte bNum;
    private short sNum;
    private int iNum;
    private long lNum;
    private float fNum;
    private double dNum;
    private char cSymbol;
    private boolean bFlag;
    private Byte bNum1;
    private Short sNum1;
    private Integer iNum1;
    private Long lNum1;
    private Float fNum1;
    private Double dNum1;
    private Character cSymbol1;
    private String str;
    private Boolean bFlag1;
    public DataType(){
        this.bNum = 0;
        this.sNum = 0;
        this.iNum = 0;
        this.lNum = 0;
        this.fNum = 0;
        this.dNum = 0;
        this.cSymbol = '*';
        this.bFlag = false;
        this.bNum1 = 0;
        this.sNum1 = new Short((short)0);
        this.iNum1 = new Integer(0);
        this.lNum1 = (long)0;
        this.fNum1 = new Float(0);
        this.dNum1 = (double)0;
        this.cSymbol1 = new Character('*');
        this.str = "";
        this.bFlag1 = new Boolean("true");
    }

    public float getfNum() {
        return fNum;
    }

    public void setfNum(float fNum) {
        this.fNum = fNum;
    }

    public double getdNum() {
        return dNum;
    }

    public void setdNum(double dNum) {
        this.dNum = dNum;
    }

    public char getcSymbol() {
        return cSymbol;
    }

    public void setcSymbol(char cSymbol) {
        this.cSymbol = cSymbol;
    }

    public Byte getbNum1() {
        return bNum1;
    }

    public void setbNum1(Byte bNum1) {
        this.bNum1 = bNum1;
    }

    public Short getsNum1() {
        return sNum1;
    }

    public void setsNum1(Short sNum1) {
        this.sNum1 = sNum1;
    }

    public Integer getiNum1() {
        return iNum1;
    }

    public void setiNum1(Integer iNum1) {
        this.iNum1 = iNum1;
    }

    public Float getfNum1() {
        return fNum1;
    }

    public void setfNum1(Float fNum1) {
        this.fNum1 = fNum1;
    }

    public Double getdNum1() {
        return dNum1;
    }

    public void setdNum1(Double dNum1) {
        this.dNum1 = dNum1;
    }

    public Character getcSymbol1() {
        return cSymbol1;
    }

    public void setcSymbol1(Character cSymbol1) {
        this.cSymbol1 = cSymbol1;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public byte getbNum() {
        return bNum;
    }

    public void setbNum(byte bNum) {
        this.bNum = bNum;
    }

    public int getiNum() {
        return iNum;
    }

    public void setiNum(int iNum) {
        this.iNum = iNum;
    }

    public boolean isbFlag() {
        return bFlag;
    }

    public void setbFlag(boolean bFlag) {
        this.bFlag = bFlag;
    }

    public Boolean getbFlag1() {
        return bFlag1;
    }

    public void setbFlag1(Boolean bFlag1) {
        this.bFlag1 = bFlag1;
    }

    public short getsNum() {
        return sNum;
    }

    public void setsNum(short sNum) {
        this.sNum = sNum;
    }

    public long getlNum() {
        return lNum;
    }

    public void setlNum(long lNum) {
        this.lNum = lNum;
    }

    public Long getlNum1() {
        return lNum1;
    }

    public void setlNum1(Long lNum1) {
        this.lNum1 = lNum1;
    }
}
