package com.szw.codegen.core.entity;

import com.szw.codegen.core.util.NameUtil;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * 对应数据库表
 *
 * @author SZW
 */
@Data
@Accessors(chain = true)
public class Table {
	/**
	 * String => table name,Upper Camel Case.
	 */
	private String name;
	/**
	 * String => table name,lower Camel Case.
	 */
	private String lccName;
	/**
	 * String => raw table name.
	 */
	private String rawName;
	/**
	 * String => table catalog (may be null)
	 */
	private String catalog;
	/**
	 * String => table schema (may be null)
	 */
	private String schema;
	/**
	 * String => table type. Typical types are "TABLE", "VIEW", "SYSTEM TABLE", "GLOBAL TEMPORARY", "LOCAL TEMPORARY", "ALIAS", "SYNONYM".
	 */
	private String type;
	/**
	 * String => explanatory comment on the table
	 */
	private String remarks;
	/**
	 * Fields
	 */
	private List<Field> fields = new ArrayList<> ();

	public Table(String tableName) {
		this.rawName = tableName;
		this.lccName = NameUtil.toLowerCamelCase (tableName);
		this.name = NameUtil.toUpperCamelCase (tableName);
	}
}