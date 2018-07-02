package mx.rafex.blog.back.daos.sql.mapeos.usuarios;

import static mx.rafex.blog.back.daos.sql.mapeos.usuarios.UsuarioConsultas.SELECT_USUARIOS;
//import static mx.rafex.blog.back.daos.sql.mapeos.usuarios.UsuarioConsultas.INSERT_USUARIO;
//import static mx.rafex.blog.back.daos.sql.mapeos.usuarios.UsuarioConsultas.UPDATE_USUARIO;
//import static mx.rafex.blog.back.daos.sql.mapeos.usuarios.UsuarioConsultas.DELETE_USUARIO;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import mx.rafex.blog.back.dtos.daos.sql.usuarios.UsuarioSqlDto;

@Mapper
public interface UsuarioSqlMaper {

    @Select(SELECT_USUARIOS)
    public List<UsuarioSqlDto> select();

    public UsuarioSqlDto selectUnUsuario(UsuarioSqlDto usuario);
    
 
    public Integer insert(UsuarioSqlDto usuario);

   
    public Integer update(UsuarioSqlDto usuario);


    public Integer delete(UsuarioSqlDto usuario);
}
