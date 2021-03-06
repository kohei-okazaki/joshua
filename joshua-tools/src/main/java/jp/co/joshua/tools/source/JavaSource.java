package jp.co.joshua.tools.source;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.co.joshua.tools.source.type.AccessType;
import jp.co.joshua.tools.source.type.ClassType;

/**
 * 自動生成Javaソースの本体クラス
 *
 * @version 1.0.0
 */
public class JavaSource {

    /** パッケージ */
    private Package pack;
    /** import文のリスト */
    private List<Import> importList = new ArrayList<>();
    /** クラスのJavaDoc */
    private String classJavaDoc;
    /** アクセス型 */
    private AccessType accessType;
    /** クラス型 */
    private ClassType classType;
    /** クラス名 */
    private String className;
    /** 継承クラス */
    private Class<?> extendsClass;
    /** 実装インターフェース */
    private List<Class<?>> implInterfaceList = new ArrayList<>();
    /** クラスに付与するアノテーションのリスト */
    private Map<Class<?>, String> classAnnotationMap = new LinkedHashMap<>();
    /** Enum定義情報のリスト */
    private List<Enum> enumList = new ArrayList<>();
    /** フィールド情報のリスト */
    private List<Field> fieldList = new ArrayList<>();
    /** コンストラクタ情報のリスト */
    private List<Constructor> constructorList = new ArrayList<>();
    /** メソッドのリスト */
    private List<Method> methodList = new ArrayList<>();

    /**
     * packを返す
     *
     * @return pack
     */
    public Package getPackage() {
        return pack;
    }

    /**
     * packを設定する
     *
     * @param pack
     *            パッケージ
     */
    public void setPackage(Package pack) {
        this.pack = pack;
    }

    /**
     * importを追加する
     *
     * @param im
     *            import
     */
    public void addImport(Import im) {
        this.importList.add(im);
    }

    /**
     * importListを返す
     *
     * @return importList
     */
    public List<Import> getImportList() {
        return importList;
    }

    /**
     * classJavaDocを返す
     *
     * @return classJavaDoc
     */
    public String getClassJavaDoc() {
        return classJavaDoc;
    }

    /**
     * classJavaDocを設定する
     *
     * @param classJavaDoc
     *            classJavaDoc
     */
    public void setClassJavaDoc(String classJavaDoc) {
        this.classJavaDoc = classJavaDoc;
    }

    /**
     * accessTypeを返す
     *
     * @return accessType
     */
    public AccessType getAccessType() {
        return accessType;
    }

    /**
     * accessTypeを設定する
     *
     * @param accessType
     *            アクセスタイプ
     */
    public void setAccessType(AccessType accessType) {
        this.accessType = accessType;
    }

    /**
     * classTypeを返す
     *
     * @return classType
     */
    public ClassType getClassType() {
        return classType;
    }

    /**
     * classTypeを設定する
     *
     * @param classType
     *            クラスタイプ
     */
    public void setClassType(ClassType classType) {
        this.classType = classType;
    }

    /**
     * classNameを返す
     *
     * @return className
     */
    public String getClassName() {
        return className;
    }

    /**
     * classNameを設定する
     *
     * @param className
     *            クラス名
     */
    public void setClassName(String className) {
        this.className = className;
    }

    /**
     * extendsClassを返す
     *
     * @return extendsClass
     */
    public Class<?> getExtendsClass() {
        return extendsClass;
    }

    /**
     * extendsClassを設定する
     *
     * @param extendsClass
     *            継承クラス
     */
    public void setExtendsClass(Class<?> extendsClass) {
        this.extendsClass = extendsClass;
    }

    /**
     * enumListを返す
     *
     * @return enumList
     */
    public List<Enum> getEnumList() {
        return enumList;
    }

    /**
     * Enumを追加する
     *
     * @param e
     *            Enum
     */
    public void addEnum(Enum e) {
        this.enumList.add(e);
    }

    /**
     * fieldListを返す
     *
     * @return fieldList
     */
    public List<Field> getFieldList() {
        return fieldList;
    }

    /**
     * fieldを追加する
     *
     * @param field
     *            フィールド
     */
    public void addField(Field field) {
        this.fieldList.add(field);
    }

    /**
     * constructorListを返す
     *
     * @return constructorList
     */
    public List<Constructor> getConstructorList() {
        return constructorList;
    }

    /**
     * constructorを追加する
     *
     * @param constructor
     *            コンストラクタ
     */
    public void addConstructor(Constructor constructor) {
        this.constructorList.add(constructor);
    }

    /**
     * methodListを返す
     *
     * @return methodList
     */
    public List<Method> getMethodList() {
        return methodList;
    }

    /**
     * methodを追加する
     *
     * @param method
     *            メソッド
     */
    public void addMethod(Method method) {
        this.methodList.add(method);
    }

    /**
     * implInterfaceListを返す
     *
     * @return implInterfaceList
     */
    public List<Class<?>> getImplInterfaceList() {
        return implInterfaceList;
    }

    /**
     * implInterfaceを追加する
     *
     * @param implInterface
     *            継承するインターフェース
     */
    public void addImplInterface(Class<?> implInterface) {
        this.implInterfaceList.add(implInterface);
    }

    /**
     * classAnnotationMapを返す
     *
     * @return classAnnotationMap
     */
    public Map<Class<?>, String> getClassAnnotationMap() {
        return classAnnotationMap;
    }

    /**
     * クラスアノテーションを追加する
     *
     * @param clazz
     *            アノテーションのクラス型
     * @param value
     *            値
     */
    public void addClassAnnotation(Class<?> clazz, String value) {
        this.classAnnotationMap.put(clazz, value);
    }

}
