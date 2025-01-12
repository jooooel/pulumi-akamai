// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CpsDvEnrollmentOrganizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final CpsDvEnrollmentOrganizationArgs Empty = new CpsDvEnrollmentOrganizationArgs();

    @Import(name="addressLineOne", required=true)
    private Output<String> addressLineOne;

    public Output<String> addressLineOne() {
        return this.addressLineOne;
    }

    @Import(name="addressLineTwo")
    private @Nullable Output<String> addressLineTwo;

    public Optional<Output<String>> addressLineTwo() {
        return Optional.ofNullable(this.addressLineTwo);
    }

    @Import(name="city", required=true)
    private Output<String> city;

    public Output<String> city() {
        return this.city;
    }

    @Import(name="countryCode", required=true)
    private Output<String> countryCode;

    public Output<String> countryCode() {
        return this.countryCode;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="phone", required=true)
    private Output<String> phone;

    public Output<String> phone() {
        return this.phone;
    }

    @Import(name="postalCode", required=true)
    private Output<String> postalCode;

    public Output<String> postalCode() {
        return this.postalCode;
    }

    @Import(name="region", required=true)
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    private CpsDvEnrollmentOrganizationArgs() {}

    private CpsDvEnrollmentOrganizationArgs(CpsDvEnrollmentOrganizationArgs $) {
        this.addressLineOne = $.addressLineOne;
        this.addressLineTwo = $.addressLineTwo;
        this.city = $.city;
        this.countryCode = $.countryCode;
        this.name = $.name;
        this.phone = $.phone;
        this.postalCode = $.postalCode;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CpsDvEnrollmentOrganizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CpsDvEnrollmentOrganizationArgs $;

        public Builder() {
            $ = new CpsDvEnrollmentOrganizationArgs();
        }

        public Builder(CpsDvEnrollmentOrganizationArgs defaults) {
            $ = new CpsDvEnrollmentOrganizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder addressLineOne(Output<String> addressLineOne) {
            $.addressLineOne = addressLineOne;
            return this;
        }

        public Builder addressLineOne(String addressLineOne) {
            return addressLineOne(Output.of(addressLineOne));
        }

        public Builder addressLineTwo(@Nullable Output<String> addressLineTwo) {
            $.addressLineTwo = addressLineTwo;
            return this;
        }

        public Builder addressLineTwo(String addressLineTwo) {
            return addressLineTwo(Output.of(addressLineTwo));
        }

        public Builder city(Output<String> city) {
            $.city = city;
            return this;
        }

        public Builder city(String city) {
            return city(Output.of(city));
        }

        public Builder countryCode(Output<String> countryCode) {
            $.countryCode = countryCode;
            return this;
        }

        public Builder countryCode(String countryCode) {
            return countryCode(Output.of(countryCode));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder phone(Output<String> phone) {
            $.phone = phone;
            return this;
        }

        public Builder phone(String phone) {
            return phone(Output.of(phone));
        }

        public Builder postalCode(Output<String> postalCode) {
            $.postalCode = postalCode;
            return this;
        }

        public Builder postalCode(String postalCode) {
            return postalCode(Output.of(postalCode));
        }

        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public CpsDvEnrollmentOrganizationArgs build() {
            $.addressLineOne = Objects.requireNonNull($.addressLineOne, "expected parameter 'addressLineOne' to be non-null");
            $.city = Objects.requireNonNull($.city, "expected parameter 'city' to be non-null");
            $.countryCode = Objects.requireNonNull($.countryCode, "expected parameter 'countryCode' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.phone = Objects.requireNonNull($.phone, "expected parameter 'phone' to be non-null");
            $.postalCode = Objects.requireNonNull($.postalCode, "expected parameter 'postalCode' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
