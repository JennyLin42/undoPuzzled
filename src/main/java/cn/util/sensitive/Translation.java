package cn.util.sensitive;

class Translation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);
        //繁体转换简体
        String traditionalSrc = "核心提示：澳大利亞FAXTS新聞3月5日刊登評論認為，美國在全球一系列被解釋成用來防禦來自伊朗和朝鮮導彈襲擊的彈道導彈防禦系統的部署行為，以及最近將先進具有反導能力愛國者導彈出售給台灣的動作，其根本目的是針對兩個主要的核大國--中國和俄羅斯。";
        String simplified = converter.convert(traditionalSrc);
        System.out.println(simplified);
        //简体转换繁体    
        String traditional = ZHConverter.convert(simplified,ZHConverter.TRADITIONAL);
        System.out.println(traditional);    
	}

}
