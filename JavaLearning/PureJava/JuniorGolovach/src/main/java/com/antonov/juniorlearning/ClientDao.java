/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.juniorlearning;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Antonov
 */
public interface ClientDao {

    public List<Client> selectAll() throws SQLException;

    public void deleteById(int id) throws SQLException;

    public void insertClient(Client client) throws SQLException;

    public int insertClientAndGetId(Client client) throws SQLException;

    public void insertClientBatch(Client clientl, int quiantity) throws SQLException;

    public void insertListClientsBatch(List<Client> list) throws SQLException;
}
