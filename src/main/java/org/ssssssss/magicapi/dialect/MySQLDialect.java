package org.ssssssss.magicapi.dialect;


import org.ssssssss.magicapi.functions.BoundSql;

public class MySQLDialect implements Dialect {

    @Override
    public String getPageSql(String sql, BoundSql boundSql, long offset, long limit) {
        boundSql.addParameter(offset);
        boundSql.addParameter(limit);
        return sql + " limit ?,?";
    }
}
