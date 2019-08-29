package tws.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import tws.entity.ParkingBoy;

@Mapper
public interface ParkingBoyMapper {
    @Insert("insert into parkingboy values (#{parkingBoy.parkingboyId},#{parkingBoy.parkingboyName},#{parkingBoy.parkingboyAge})")
    void insertParkingBoy(@Param("parkingBoy") ParkingBoy parkingBoy);

}
