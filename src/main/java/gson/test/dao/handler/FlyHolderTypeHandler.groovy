package gson.test.dao.handler

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import gson.test.ext.FlyHolderDeserializer
import gson.test.ext.FlyHolderSerializer
import gson.test.model.FlyHolder
import org.apache.ibatis.type.BaseTypeHandler
import org.apache.ibatis.type.JdbcType
import org.apache.ibatis.type.MappedJdbcTypes
import org.apache.ibatis.type.MappedTypes

import java.sql.CallableStatement
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.SQLException

/**
 * Created by aobot on 2016-08-11 14:29.
 */
@MappedJdbcTypes(JdbcType.VARCHAR)
@MappedTypes(FlyHolder.class)
class FlyHolderTypeHandler extends BaseTypeHandler<FlyHolder> {

    static Gson gson
    static {
        gson = new GsonBuilder().
                registerTypeAdapter(FlyHolder.class, new FlyHolderDeserializer()).
                registerTypeAdapter(FlyHolder.class, new FlyHolderSerializer()).
                create()
    }

    void setNonNullParameter(PreparedStatement ps, int i, FlyHolder holder, JdbcType jdbcType) throws SQLException {
        ps.setString(i, gson.toJson(holder))
    }

    FlyHolder getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return gson.fromJson(rs.getString(columnName),FlyHolder)
    }

    FlyHolder getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return gson.fromJson(rs.getString(columnIndex),FlyHolder)
    }

    FlyHolder getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return gson.fromJson(cs.getString(columnIndex),FlyHolder)
    }
}
