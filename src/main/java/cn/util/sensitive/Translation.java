package cn.util.sensitive;

class Translation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ZHConverter converter = ZHConverter.getInstance(ZHConverter.SIMPLIFIED);
        //����ת������
        String traditionalSrc = "������ʾ���Ĵ�����FAXTS��3��5�տ����uՓ�J�飬������ȫ��һϵ�б���ጳ��Á���R�������ʺͳ��r�����u���ď����������Rϵ�y�Ĳ����О飬�Լ���������M���з��������ۇ��ߌ������۽ǫ���Ą����������Ŀ����ᘌ��ɂ���Ҫ�ĺ˴��--�Ї��Ͷ��_˹��";
        String simplified = converter.convert(traditionalSrc);
        System.out.println(simplified);
        //����ת������    
        String traditional = ZHConverter.convert(simplified,ZHConverter.TRADITIONAL);
        System.out.println(traditional);    
	}

}
