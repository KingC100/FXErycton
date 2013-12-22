package fxercton.AppUtil;

import java.io.File;

public class Const {

        public static final String fs = File.separator;
    
	/* System */
	public static final String OS_NAME					= "os.name";
	public static final String MAC_OS					= "Mac OS";
	public static final String LINUX_OS					= "Linux";
	public static final Integer NOT_FOUND				= -1;

	/* Layout */
	// ウィンドウ名
	public static final String	WindowTitle				= "Erycton";
	
	// ウィンドウサイズ
	public static final Integer BOUNDS_X				= 500;
	public static final Integer BOUNDS_Y				= 500;
	public static final Integer BOUNDS_WIDTH	  		= 700;
	public static final Integer BOUNDS_HEIGHT	  	    = 300;
	
	// グリッドレイアウト
	public static final Integer GRID_LAYOUT_Y 			= 7;
	public static final Integer GRID_LAYOUT_X 			= 5;
	
	// テキスト最大入力数
	public static final Integer RIVAL_NAME_TXT_NUM		= 14;
	public static final Integer RIVAL_RATE_TXT_NUM		= 4;
	public static final Integer SET_TEXT_COLUMNS 		= 6;

	// メッセージ
	public static final String MSG_TEXT_ERR_EMPTY 		= "　　　　　　　　入力待ち";
	public static final String MSG_TEXT_ERR_SUCCESS		= "				出力成功";
	public static final String MSG_TEXT_ERR 			= "　　　　　　　入力エラー";
	public static final String EXPORT_ERR				= "ExportError!";
	public static final String MSG_TEXT_PROP 			= "プロパティファイルが存在しません";
	public static final String MSG_TEXT_NAME			= "ポケモン名のファイルが存在しません";
	
	// コントロール名、テキスト
	public static final String MENU_BATTLE_TYPE			= "対戦種別";
	public static final String MENU_SINGLE_BATTLE		= "▷シングル";
	public static final String MENU_DOUBLE_BATTLE		= "▷ダブル";
	public static final String MENU_VIEW_EXPORT			= "HTML";
	public static final String MENU_VIEW_EXPORT_TRUE	= "▷出力する";
	public static final String MENU_VIEW_EXPORT_FALSE	= "▷出力しない";
	
	public static final String LBL_TEXT_RIVAL_NAME   	= "相手名 : ";
	public static final String LBL_TEXT_RIVAL_RATE 	 	= "相手レート / 対戦数 : ";
	public static final String LBL_TEXT_RIVAL_SHOW_1 	= "相手 1 : ";
	public static final String LBL_TEXT_RIVAL_SHOW_2 	= " 2 : ";
	public static final String LBL_TEXT_RIVAL_SHOW_3 	= " 3 : ";
	public static final String LBL_TEXT_RIVAL_SHOW_4 	= "　     4 : ";
	public static final String LBL_TEXT_RIVAL_SHOW_5 	= " 5 : ";
	public static final String LBL_TEXT_RIVAL_SHOW_6 	= " 6 : ";
	public static final String BTN_TEXT_ENTRY		 	= "登録";
	public static final String LBL_TEXT_ELECT_ME_1	 	= "自分 1 : ";
	public static final String LBL_TEXT_ELECT_ME_2	 	= " 2 : ";
	public static final String LBL_TEXT_ELECT_ME_3	 	= " 3 : ";
	public static final String LBL_TEXT_ELECT_ME_4	 	= " 4 : ";
	public static final String LBL_TEXT_ELECT_RIVAL_1 	= "選出 1 : ";
	public static final String LBL_TEXT_ELECT_RIVAL_2 	= " 2 : ";
	public static final String LBL_TEXT_ELECT_RIVAL_3 	= " 3 : ";
	public static final String LBL_TEXT_ELECT_RIVAL_4 	= " 4 : ";
	public static final String BTN_TEXT_RESULT			= "対戦結果 : ";
	public static final String RBTN_TEXT_WIN			= "勝ち";
	public static final String RBTN_TEXT_LOSE			= "負け";
	public static final String RBTN_TEXT_CUT			= "切断";

	
    /* File & Path */
	// propertiesファイル名、パス
	public static final String PROPERTIES_PATH 			= "./conf/Erycton.properties";
	public static final String DIR_FRM 					= "frm/"; 
	public static final String WINDOW_ICON_PATH			= "./Erycton.png";

	// propertiesファイルから読み込むプロパティ名
	public static final String POKEMONNAME_NORMAL		= "POKEMON_NAME_NORMAL_PATH";
	public static final String POKEMONNAME_FORME 		= "POKEMON_NAME_FORME_PATH";
	public static final String POKEMON_IMAGE_PATH 		= "POKEMON_IMAGE_PATH";
	public static final String EXPORT_PARTITION			= "EXPORT_PARTITION";
	public static final String EXPORT_PARTITION_BAR		= "EXPORT_PARTITION_BAR";
	public static final String NORMAL_MAX				= "NORMAL_MAX";
	public static final String FORME_MAX				= "FORME_MAX";
	public static final String BATTLE_TYPE				= "BATTLE_TYPE";
	public static final String HATENA_PATH				= "HATENA_PATH";

	// 出力先のパス
	public static final String EXPORT_PATH 				= "./export/";
	public static final String EXPORT_HTML_PATH			= "/html/";
	public static final String EXPORT_TXT_PATH			= "/txt/";
	
	// html出力時のイメージパス.
	public static final String IMG_PATH_EXT				= "../../../";

	// ファイル拡張子
	public static final String FILE_TXT 				= ".txt";
	public static final String FILE_PNG					= ".png";
	public static final String FILE_HTML				= ".html";
	
	// 対戦区分
	public static final String SINGLE 					= "single";
	public static final String DOUBLE 					= "double";
	
	/* 文字列 */
	public static final String strnull 					= "";
	public static final String str_null 				= " ";
	public static final String Empty 					= "";
	public static final String TAB						= "\t";
	public static final String BL_TRUE					= "true";
	public static final String BL_FALSE					= "false";	
	public static char[] SIGNS2 						= {             '！',
																		'＃',
																		'＄',
																		'％',
																		'＆',
																		'（',
																		'）',
																		'＊',
																		'＋',
																		'，',
																		'−',
																		'．',
																		'／',
																		'：',
																		'；',
																		'＜',
																		'＝',
																		'＞',
																		'？',
																		'＠',
																		'［',
																		'］',
																		'＾',
																		'＿',
																		'｛',
																		'｜',
																		'｝'
																		};


	// imgファイルが見つからなかった際の返り値
	public static final String NOT_FIND 				= "0";
	
	// ？アイコン
	public static final String HATENA 					= "hatena";
	
	/* 数値・数字 */
	public static final char zero 						= '0';
	public static final char nine 						= '9';
	public static final int DIFFERENCE 					= 'Ａ' - 'A';
	
	/* 日付 */
	public static final String df						= "yyyy/MM/dd/E/HH/mm/ss";
	public static final String partion					= "/";
	public static final String YEAR						= "y";
	public static final String MONTH 					= "M";
	public static final String DAY 						= "d";
	public static final String HOUR						= "H";
	public static final String MINUTE					= "m";
	public static final String SECOND					= "s";
	public static final String WEEK						= "E";
	public static final String NEN						= "年";
	public static final String GETSU					= "月";
	public static final String HI						= "日";
	public static final String ALL						= "ALL";

	/* 出力 */
	public static final String ENCODE					= "UTF-8"; 
	public static final String WIN						= "WIN";
	public static final String LOSE						= "LOSE";
	public static final String CUT						= "CUT";
	public static final String TOP_ITEMNAME_SINGLE		= "対戦相手名, 対戦相手レート, 相手見せ合い1, 2, 3, 4, 5, 6, "
																							+ "自選出1, 2, 3, 相手選出1, 2, 3, 対戦結果, 対戦時間";
	public static final String TOP_ITEMNAME_DOUBLE		= "対戦相手名, 対戦相手レート, 相手見せ合い1, 2, 3, 4, 5, 6,"
																							+ " 自選出1, 2, 3,4, 相手選出1, 2, 3,4 対戦結果, 対戦時間";

}