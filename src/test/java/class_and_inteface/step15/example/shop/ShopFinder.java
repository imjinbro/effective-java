package class_and_inteface.step15.example.shop;

import org.springframework.stereotype.Service;

/*
	Shop에 대한 데이터를 찾을 때 인터페이스가 되는 서비스
	- 가장 껍데기는 Public으로 열어둬서 재활용(Shop에 대한 모든 기능) 가능하게, 한 곳으로 기능이 모이게끔
 */
@Service
public class ShopFinder {

	public Object find() {
		ShopValidator.validate();
		return null;
	}
}
