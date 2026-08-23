package weather2.weathersystem.tornado;

/**
 * Visual funnel morphology only.
 *
 * This does not change tornado damage, wind strength, Fujita rating,
 * block pulling, or storm progression.
 */
public enum TornadoVisualType
{
    UNSET(-1),
    ROPE(0),
    CONE(1),
    STOVEPIPE(2),
    WEDGE(3);

    private final int id;

    TornadoVisualType(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public static TornadoVisualType fromId(int id)
    {
        for (TornadoVisualType type : values())
        {
            if (type.id == id)
                return type;
        }

        return CONE;
    }
}
