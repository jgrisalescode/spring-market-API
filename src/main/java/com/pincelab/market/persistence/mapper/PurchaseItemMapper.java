package com.pincelab.market.persistence.mapper;

import com.pincelab.market.domain.PurchaseItem;
import com.pincelab.market.persistence.entity.ComprasProducto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface PurchaseItemMapper {

    @Mappings({
        @Mapping(source = "id.idProducto", target = "productId"),
        @Mapping(source = "cantidad", target = "quantity"),
            // total is the same in both classes, so you can do not write it if you want
        @Mapping(source = "total", target = "total"),
        @Mapping(source = "estado", target = "active")
    })
    PurchaseItem toPurchaseItem(ComprasProducto producto);

    @InheritInverseConfiguration
    @Mappings({
            @Mapping(target = "producto", ignore = true),
            @Mapping(target = "compra", ignore = true),
            @Mapping(target = "id.idCompra", ignore = true)
    })
    ComprasProducto comprasProducto(PurchaseItem purchaseItem);
}
