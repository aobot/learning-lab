package com.reload.model;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by aobot on 2016-08-10 15:58.
 */
@MappedTypes(Extra.class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class ExtraTypeHandler extends BaseTypeHandler<Extra> {
    public void setNonNullParameter(PreparedStatement ps, int i, Extra parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, parameter.getMsg());
    }

    public Extra getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return new Extra(rs.getString(columnName));
    }

    public Extra getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return new Extra(rs.getString(columnIndex));
    }

    public Extra getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return new Extra(cs.getString(columnIndex));
    }
}
