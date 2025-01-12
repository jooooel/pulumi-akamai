// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection extends com.pulumi.resources.InvokeArgs {

    public static final GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection Empty = new GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection();

    @Import(name="countries")
    private @Nullable List<String> countries;

    public Optional<List<String>> countries() {
        return Optional.ofNullable(this.countries);
    }

    @Import(name="dmas")
    private @Nullable List<String> dmas;

    public Optional<List<String>> dmas() {
        return Optional.ofNullable(this.dmas);
    }

    @Import(name="enableGeoProtection")
    private @Nullable Boolean enableGeoProtection;

    public Optional<Boolean> enableGeoProtection() {
        return Optional.ofNullable(this.enableGeoProtection);
    }

    @Import(name="enableGeoRedirectOnDeny")
    private @Nullable Boolean enableGeoRedirectOnDeny;

    public Optional<Boolean> enableGeoRedirectOnDeny() {
        return Optional.ofNullable(this.enableGeoRedirectOnDeny);
    }

    @Import(name="enableIpProtection")
    private @Nullable Boolean enableIpProtection;

    public Optional<Boolean> enableIpProtection() {
        return Optional.ofNullable(this.enableIpProtection);
    }

    @Import(name="enableIpRedirectOnDeny")
    private @Nullable Boolean enableIpRedirectOnDeny;

    public Optional<Boolean> enableIpRedirectOnDeny() {
        return Optional.ofNullable(this.enableIpRedirectOnDeny);
    }

    @Import(name="enableReferrerProtection")
    private @Nullable Boolean enableReferrerProtection;

    public Optional<Boolean> enableReferrerProtection() {
        return Optional.ofNullable(this.enableReferrerProtection);
    }

    @Import(name="enableReferrerRedirectOnDeny")
    private @Nullable Boolean enableReferrerRedirectOnDeny;

    public Optional<Boolean> enableReferrerRedirectOnDeny() {
        return Optional.ofNullable(this.enableReferrerRedirectOnDeny);
    }

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="geoProtectionMode")
    private @Nullable String geoProtectionMode;

    public Optional<String> geoProtectionMode() {
        return Optional.ofNullable(this.geoProtectionMode);
    }

    @Import(name="geoProtectionTitle")
    private @Nullable String geoProtectionTitle;

    public Optional<String> geoProtectionTitle() {
        return Optional.ofNullable(this.geoProtectionTitle);
    }

    @Import(name="geoRedirectUrl")
    private @Nullable String geoRedirectUrl;

    public Optional<String> geoRedirectUrl() {
        return Optional.ofNullable(this.geoRedirectUrl);
    }

    @Import(name="ipAddresses")
    private @Nullable List<String> ipAddresses;

    public Optional<List<String>> ipAddresses() {
        return Optional.ofNullable(this.ipAddresses);
    }

    @Import(name="ipProtectionMode")
    private @Nullable String ipProtectionMode;

    public Optional<String> ipProtectionMode() {
        return Optional.ofNullable(this.ipProtectionMode);
    }

    @Import(name="ipProtectionTitle")
    private @Nullable String ipProtectionTitle;

    public Optional<String> ipProtectionTitle() {
        return Optional.ofNullable(this.ipProtectionTitle);
    }

    @Import(name="ipRedirectUrl")
    private @Nullable String ipRedirectUrl;

    public Optional<String> ipRedirectUrl() {
        return Optional.ofNullable(this.ipRedirectUrl);
    }

    @Import(name="locked")
    private @Nullable Boolean locked;

    public Optional<Boolean> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="overrideIpAddresses")
    private @Nullable List<String> overrideIpAddresses;

    public Optional<List<String>> overrideIpAddresses() {
        return Optional.ofNullable(this.overrideIpAddresses);
    }

    @Import(name="referrerDomains")
    private @Nullable List<String> referrerDomains;

    public Optional<List<String>> referrerDomains() {
        return Optional.ofNullable(this.referrerDomains);
    }

    @Import(name="referrerProtectionMode")
    private @Nullable String referrerProtectionMode;

    public Optional<String> referrerProtectionMode() {
        return Optional.ofNullable(this.referrerProtectionMode);
    }

    @Import(name="referrerProtectionTitle")
    private @Nullable String referrerProtectionTitle;

    public Optional<String> referrerProtectionTitle() {
        return Optional.ofNullable(this.referrerProtectionTitle);
    }

    @Import(name="referrerRedirectUrl")
    private @Nullable String referrerRedirectUrl;

    public Optional<String> referrerRedirectUrl() {
        return Optional.ofNullable(this.referrerRedirectUrl);
    }

    @Import(name="regions")
    private @Nullable List<String> regions;

    public Optional<List<String>> regions() {
        return Optional.ofNullable(this.regions);
    }

    @Import(name="templateUuid")
    private @Nullable String templateUuid;

    public Optional<String> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="uuid")
    private @Nullable String uuid;

    public Optional<String> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    private GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection() {}

    private GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection(GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection $) {
        this.countries = $.countries;
        this.dmas = $.dmas;
        this.enableGeoProtection = $.enableGeoProtection;
        this.enableGeoRedirectOnDeny = $.enableGeoRedirectOnDeny;
        this.enableIpProtection = $.enableIpProtection;
        this.enableIpRedirectOnDeny = $.enableIpRedirectOnDeny;
        this.enableReferrerProtection = $.enableReferrerProtection;
        this.enableReferrerRedirectOnDeny = $.enableReferrerRedirectOnDeny;
        this.enabled = $.enabled;
        this.geoProtectionMode = $.geoProtectionMode;
        this.geoProtectionTitle = $.geoProtectionTitle;
        this.geoRedirectUrl = $.geoRedirectUrl;
        this.ipAddresses = $.ipAddresses;
        this.ipProtectionMode = $.ipProtectionMode;
        this.ipProtectionTitle = $.ipProtectionTitle;
        this.ipRedirectUrl = $.ipRedirectUrl;
        this.locked = $.locked;
        this.overrideIpAddresses = $.overrideIpAddresses;
        this.referrerDomains = $.referrerDomains;
        this.referrerProtectionMode = $.referrerProtectionMode;
        this.referrerProtectionTitle = $.referrerProtectionTitle;
        this.referrerRedirectUrl = $.referrerRedirectUrl;
        this.regions = $.regions;
        this.templateUuid = $.templateUuid;
        this.uuid = $.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection(Objects.requireNonNull(defaults));
        }

        public Builder countries(@Nullable List<String> countries) {
            $.countries = countries;
            return this;
        }

        public Builder countries(String... countries) {
            return countries(List.of(countries));
        }

        public Builder dmas(@Nullable List<String> dmas) {
            $.dmas = dmas;
            return this;
        }

        public Builder dmas(String... dmas) {
            return dmas(List.of(dmas));
        }

        public Builder enableGeoProtection(@Nullable Boolean enableGeoProtection) {
            $.enableGeoProtection = enableGeoProtection;
            return this;
        }

        public Builder enableGeoRedirectOnDeny(@Nullable Boolean enableGeoRedirectOnDeny) {
            $.enableGeoRedirectOnDeny = enableGeoRedirectOnDeny;
            return this;
        }

        public Builder enableIpProtection(@Nullable Boolean enableIpProtection) {
            $.enableIpProtection = enableIpProtection;
            return this;
        }

        public Builder enableIpRedirectOnDeny(@Nullable Boolean enableIpRedirectOnDeny) {
            $.enableIpRedirectOnDeny = enableIpRedirectOnDeny;
            return this;
        }

        public Builder enableReferrerProtection(@Nullable Boolean enableReferrerProtection) {
            $.enableReferrerProtection = enableReferrerProtection;
            return this;
        }

        public Builder enableReferrerRedirectOnDeny(@Nullable Boolean enableReferrerRedirectOnDeny) {
            $.enableReferrerRedirectOnDeny = enableReferrerRedirectOnDeny;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder geoProtectionMode(@Nullable String geoProtectionMode) {
            $.geoProtectionMode = geoProtectionMode;
            return this;
        }

        public Builder geoProtectionTitle(@Nullable String geoProtectionTitle) {
            $.geoProtectionTitle = geoProtectionTitle;
            return this;
        }

        public Builder geoRedirectUrl(@Nullable String geoRedirectUrl) {
            $.geoRedirectUrl = geoRedirectUrl;
            return this;
        }

        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            $.ipAddresses = ipAddresses;
            return this;
        }

        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }

        public Builder ipProtectionMode(@Nullable String ipProtectionMode) {
            $.ipProtectionMode = ipProtectionMode;
            return this;
        }

        public Builder ipProtectionTitle(@Nullable String ipProtectionTitle) {
            $.ipProtectionTitle = ipProtectionTitle;
            return this;
        }

        public Builder ipRedirectUrl(@Nullable String ipRedirectUrl) {
            $.ipRedirectUrl = ipRedirectUrl;
            return this;
        }

        public Builder locked(@Nullable Boolean locked) {
            $.locked = locked;
            return this;
        }

        public Builder overrideIpAddresses(@Nullable List<String> overrideIpAddresses) {
            $.overrideIpAddresses = overrideIpAddresses;
            return this;
        }

        public Builder overrideIpAddresses(String... overrideIpAddresses) {
            return overrideIpAddresses(List.of(overrideIpAddresses));
        }

        public Builder referrerDomains(@Nullable List<String> referrerDomains) {
            $.referrerDomains = referrerDomains;
            return this;
        }

        public Builder referrerDomains(String... referrerDomains) {
            return referrerDomains(List.of(referrerDomains));
        }

        public Builder referrerProtectionMode(@Nullable String referrerProtectionMode) {
            $.referrerProtectionMode = referrerProtectionMode;
            return this;
        }

        public Builder referrerProtectionTitle(@Nullable String referrerProtectionTitle) {
            $.referrerProtectionTitle = referrerProtectionTitle;
            return this;
        }

        public Builder referrerRedirectUrl(@Nullable String referrerRedirectUrl) {
            $.referrerRedirectUrl = referrerRedirectUrl;
            return this;
        }

        public Builder regions(@Nullable List<String> regions) {
            $.regions = regions;
            return this;
        }

        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }

        public Builder templateUuid(@Nullable String templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder uuid(@Nullable String uuid) {
            $.uuid = uuid;
            return this;
        }

        public GetPropertyRulesBuilderRulesV20230530BehaviorContentTargetingProtection build() {
            return $;
        }
    }

}
