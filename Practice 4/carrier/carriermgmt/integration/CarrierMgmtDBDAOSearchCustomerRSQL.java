/*=========================================================
*Copyright(c) 2022 CyberLogitec
*@FileName : CarrierMgmtDBDAOSearchCustomerRSQL.java
*@FileTitle : 
*Open Issues :
*Change history :
*@LastModifyDate : 2022.05.25
*@LastModifier : 
*@LastVersion : 1.0
* 2022.05.25 
* 1.0 Creation
=========================================================*/
package com.clt.apps.opus.esm.clv.practice4.carriermgmt.integration;

import java.util.HashMap;
import org.apache.log4j.Logger;
import com.clt.framework.support.db.ISQLTemplate;

/**
 *
 * @author Truong Vu
 * @see DAO 참조
 * @since J2EE 1.6
 */

public class CarrierMgmtDBDAOSearchCustomerRSQL implements ISQLTemplate{

	private StringBuffer query = new StringBuffer();
	
	Logger log =Logger.getLogger(this.getClass());
	
	/** Parameters definition in params/param elements */
	private HashMap<String,String[]> params = null;
	
	/**
	  * <pre>
	  * DESC Enter..
	  * </pre>
	  */
	public CarrierMgmtDBDAOSearchCustomerRSQL(){
		setQuery();
		params = new HashMap<String,String[]>();
		query.append("/*").append("\n"); 
		query.append("Path : com.clt.apps.opus.esm.clv.practice4.carriermgmt.integration").append("\n"); 
		query.append("FileName : CarrierMgmtDBDAOSearchCustomerRSQL").append("\n"); 
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
		query.append("select " ).append("\n"); 
		query.append("	cust_cnt_cd," ).append("\n"); 
		query.append("	cust_seq," ).append("\n"); 
		query.append("	cust_lgl_eng_nm," ).append("\n"); 
		query.append("	cust_abbr_nm" ).append("\n"); 
		query.append("from mdm_customer" ).append("\n"); 

	}
}