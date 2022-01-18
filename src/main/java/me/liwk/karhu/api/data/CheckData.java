package me.liwk.karhu.api.data;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public final class CheckData {

    private String name, desc;
    private Category category;
    private SubCategory subCategory;
    private boolean experimental;
    private boolean silent;
    private String credits;

}
