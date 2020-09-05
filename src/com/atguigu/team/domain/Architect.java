package com.atguigu.team.domain;

/**
 * 
 * @Description
 * @author Liulei Email:304968711@qq.com
 * @version
 * @date 2020年9月5日下午1:17:22
 */
public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary,
                      Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDetailsForTeam() {
        return getMemberDetails() + "\t架构师\t" + 
               getBonus() + "\t" + getStock();
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" +
               getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }
}
