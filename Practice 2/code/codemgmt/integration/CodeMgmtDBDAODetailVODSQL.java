/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CodeMgmtDBDAODetailVODSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2022.04.19
*@LastModifier : 
*@LastVersion : 1.0
* 2022.04.19
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.dou.doutraining.codemgmt.integration ;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Truong Vu
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CodeMgmtDBDAODetailVODSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * DESC Enter..
	  * </pre>
	  */
	public CodeMgmtDBDAODetailVODSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		String tmp = null;
		String[] arrTmp = null;
		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("intg_cd_val_ctnt",new String[]{arrTmp[0],arrTmp[1]});

		tmp = java.sql.Types.VARCHAR + ",N";
		arrTmp = tmp.split(",");
		if(arrTmp.length !=2){
			throw new IllegalArgumentException();
		}
		params.put("intg_cd_id",new String[]{arrTmp[0],arrTmp[1]});

		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.dou.doutraining.codemgmt.integration ").append("\n"); 
		query.append("FileName : CodeMgmtDBDAODetailVODSQL").append("\n"); 
		query.append("*/").append("\n"); 
	}
	
	public String getSQL(){
		return query.toString();
	}
	
	public HashMap<String,String[]> getParams() {
		return params;
	}

	/**
	 * Query 생성
	 */
	public void setQuery(){
		query.append("delete from com_intg_cd_dtl" ).append("\n"); 
		query.append("where intg_cd_id = @[intg_cd_id]" ).append("\n"); 
		query.append("and intg_cd_val_ctnt = @[intg_cd_val_ctnt]" ).append("\n"); 

	}
}