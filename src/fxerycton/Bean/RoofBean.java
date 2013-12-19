/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fxerycton.Bean;

/**
 *
 * @author kiichi
 */
public class RoofBean {
    private Integer battleType;

    /**
     * @return the battleType
     */
    public Integer getBattleType() {
        return battleType;
    }

    /**
     * @param battleType the battleType to set
     */
    public void setBattleType(Integer battleType) {
        
        this.battleType = battleType;
        System.out.println(battleType);
    
    }
}
