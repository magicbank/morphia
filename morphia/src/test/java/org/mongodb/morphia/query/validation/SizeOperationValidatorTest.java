package org.mongodb.morphia.query.validation;

public class SizeOperationValidatorTest {
/*
    @Test
    public void shouldAllowSizeOperatorForArrayListTypesAndIntegerValues() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("arrayListOfIntegers");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, 3, validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(0));
    }

    @Test
    public void shouldAllowSizeOperatorForArrayTypeAndIntValues() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("arrayOfInts");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, 3, validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(0));
    }

    @Test
    public void shouldAllowSizeOperatorForArrayTypeAndLongValues() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("arrayOfInts");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, 3L, validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(0));
    }

    @Test
    public void shouldAllowSizeOperatorForIterableTypesAndIntegerValues() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("setOfIntegers");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, 3, validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(0));
    }

    @Test
    public void shouldAllowSizeOperatorForListTypesAndIntValues() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("listOfIntegers");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, 3, validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(0));
    }

    @Test
    public void shouldAllowSizeOperatorForListTypesAndLongValues() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("listOfIntegers");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, 3L, validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(0));
    }

    @Test
    public void shouldContainValidationFailuresForBothErrorsWhenTypeIsWrongAndValueIsWrong() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("notAnArrayOrList");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, "value", validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(2));
    }

    @Test
    public void shouldNotApplyValidationToOperatorThatIsNotSize() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("list");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, EQUAL, 1, validationFailures);

        // then
        assertThat(validationApplied, is(false));
        assertThat(validationFailures.size(), is(0));
    }

    @Test
    public void shouldRejectSizeOperatorForNonIntegerValues() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("listOfStrings");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, "value", validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(1));
        assertThat(validationFailures.get(0).toString(), Matchers.containsString("should be an integer type"));
    }

    @Test
    public void shouldRejectSizeOperatorForNonListTypes() {
        // given
        MappedClass mappedClass = new MappedClass(EntityWithListsAndArrays.class, new Mapper(
            mongoClient.getMongoClientOptions().getCodecRegistry()));
        MappedField mappedField = mappedClass.getMappedField("notAnArrayOrList");
        List<ValidationFailure> validationFailures = new ArrayList<>();

        // when
        boolean validationApplied = SizeOperationValidator.getInstance().apply(mappedField, SIZE, 3, validationFailures);

        // then
        assertThat(validationApplied, is(true));
        assertThat(validationFailures.size(), is(1));
        assertThat(validationFailures.get(0).toString(), containsString("should be a List or array."));
    }
*/
}
