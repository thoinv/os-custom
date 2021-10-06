package xiaoying.engine.base;

public interface IQHWCodecQuery {
    boolean getBetaTestedFlag();

    int getMAXHWDecCount(int i);

    boolean queryHWEncCap(int i);

    int queryVideoImportFormat(int i);
}