package view;

import model.DisplayEnum;

public enum HighLowSeasonEnum implements DisplayEnum {
    HIGH_SEASON (1, "Alta temporada"),
    LOW_SEASON  (2, "Baixa temporada");

    private final int value;
    private final String displayName;

    HighLowSeasonEnum(int value, String displayName) {
        this.value = value;
        this.displayName = displayName;
    }
    @Override
    public int getValue(){
        return value;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }
}
