/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.javalearning.spring.walls.knights;

/**
 *
 * @author Dmitry
 */
public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest; // Внедрение сценария подвига
    }

    public void embarkOnQuest() throws QuestException {
        quest.embark();
    }
}
