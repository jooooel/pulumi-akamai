// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicyArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs;
import com.pulumi.akamai.inputs.GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorageArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs Empty = new GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs();

    @Import(name="allowedUserCookieAdvanced")
    private @Nullable Output<Boolean> allowedUserCookieAdvanced;

    public Optional<Output<Boolean>> allowedUserCookieAdvanced() {
        return Optional.ofNullable(this.allowedUserCookieAdvanced);
    }

    @Import(name="allowedUserCookieAutomaticSalt")
    private @Nullable Output<Boolean> allowedUserCookieAutomaticSalt;

    public Optional<Output<Boolean>> allowedUserCookieAutomaticSalt() {
        return Optional.ofNullable(this.allowedUserCookieAutomaticSalt);
    }

    @Import(name="allowedUserCookieDomain")
    private @Nullable Output<String> allowedUserCookieDomain;

    public Optional<Output<String>> allowedUserCookieDomain() {
        return Optional.ofNullable(this.allowedUserCookieDomain);
    }

    @Import(name="allowedUserCookieDomainType")
    private @Nullable Output<String> allowedUserCookieDomainType;

    public Optional<Output<String>> allowedUserCookieDomainType() {
        return Optional.ofNullable(this.allowedUserCookieDomainType);
    }

    @Import(name="allowedUserCookieDuration")
    private @Nullable Output<Integer> allowedUserCookieDuration;

    public Optional<Output<Integer>> allowedUserCookieDuration() {
        return Optional.ofNullable(this.allowedUserCookieDuration);
    }

    @Import(name="allowedUserCookieEnabled")
    private @Nullable Output<Boolean> allowedUserCookieEnabled;

    public Optional<Output<Boolean>> allowedUserCookieEnabled() {
        return Optional.ofNullable(this.allowedUserCookieEnabled);
    }

    @Import(name="allowedUserCookieHttpOnly")
    private @Nullable Output<Boolean> allowedUserCookieHttpOnly;

    public Optional<Output<Boolean>> allowedUserCookieHttpOnly() {
        return Optional.ofNullable(this.allowedUserCookieHttpOnly);
    }

    @Import(name="allowedUserCookieLabel")
    private @Nullable Output<String> allowedUserCookieLabel;

    public Optional<Output<String>> allowedUserCookieLabel() {
        return Optional.ofNullable(this.allowedUserCookieLabel);
    }

    @Import(name="allowedUserCookieManagementTitle")
    private @Nullable Output<String> allowedUserCookieManagementTitle;

    public Optional<Output<String>> allowedUserCookieManagementTitle() {
        return Optional.ofNullable(this.allowedUserCookieManagementTitle);
    }

    @Import(name="allowedUserCookieRefresh")
    private @Nullable Output<Boolean> allowedUserCookieRefresh;

    public Optional<Output<Boolean>> allowedUserCookieRefresh() {
        return Optional.ofNullable(this.allowedUserCookieRefresh);
    }

    @Import(name="allowedUserCookieSalt")
    private @Nullable Output<String> allowedUserCookieSalt;

    public Optional<Output<String>> allowedUserCookieSalt() {
        return Optional.ofNullable(this.allowedUserCookieSalt);
    }

    @Import(name="cloudletPolicy")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicyArgs> cloudletPolicy;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicyArgs>> cloudletPolicy() {
        return Optional.ofNullable(this.cloudletPolicy);
    }

    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    @Import(name="templateUuid")
    private @Nullable Output<String> templateUuid;

    public Optional<Output<String>> templateUuid() {
        return Optional.ofNullable(this.templateUuid);
    }

    @Import(name="userIdentificationByCookie")
    private @Nullable Output<Boolean> userIdentificationByCookie;

    public Optional<Output<Boolean>> userIdentificationByCookie() {
        return Optional.ofNullable(this.userIdentificationByCookie);
    }

    @Import(name="userIdentificationByHeaders")
    private @Nullable Output<Boolean> userIdentificationByHeaders;

    public Optional<Output<Boolean>> userIdentificationByHeaders() {
        return Optional.ofNullable(this.userIdentificationByHeaders);
    }

    @Import(name="userIdentificationByIp")
    private @Nullable Output<Boolean> userIdentificationByIp;

    public Optional<Output<Boolean>> userIdentificationByIp() {
        return Optional.ofNullable(this.userIdentificationByIp);
    }

    @Import(name="userIdentificationByParams")
    private @Nullable Output<Boolean> userIdentificationByParams;

    public Optional<Output<Boolean>> userIdentificationByParams() {
        return Optional.ofNullable(this.userIdentificationByParams);
    }

    @Import(name="userIdentificationKeyCookie")
    private @Nullable Output<String> userIdentificationKeyCookie;

    public Optional<Output<String>> userIdentificationKeyCookie() {
        return Optional.ofNullable(this.userIdentificationKeyCookie);
    }

    @Import(name="userIdentificationKeyHeaders")
    private @Nullable Output<List<String>> userIdentificationKeyHeaders;

    public Optional<Output<List<String>>> userIdentificationKeyHeaders() {
        return Optional.ofNullable(this.userIdentificationKeyHeaders);
    }

    @Import(name="userIdentificationKeyParams")
    private @Nullable Output<List<String>> userIdentificationKeyParams;

    public Optional<Output<List<String>>> userIdentificationKeyParams() {
        return Optional.ofNullable(this.userIdentificationKeyParams);
    }

    @Import(name="userIdentificationTitle")
    private @Nullable Output<String> userIdentificationTitle;

    public Optional<Output<String>> userIdentificationTitle() {
        return Optional.ofNullable(this.userIdentificationTitle);
    }

    @Import(name="uuid")
    private @Nullable Output<String> uuid;

    public Optional<Output<String>> uuid() {
        return Optional.ofNullable(this.uuid);
    }

    @Import(name="waitingRoomCacheTtl")
    private @Nullable Output<Integer> waitingRoomCacheTtl;

    public Optional<Output<Integer>> waitingRoomCacheTtl() {
        return Optional.ofNullable(this.waitingRoomCacheTtl);
    }

    @Import(name="waitingRoomCookieAdvanced")
    private @Nullable Output<Boolean> waitingRoomCookieAdvanced;

    public Optional<Output<Boolean>> waitingRoomCookieAdvanced() {
        return Optional.ofNullable(this.waitingRoomCookieAdvanced);
    }

    @Import(name="waitingRoomCookieAutomaticSalt")
    private @Nullable Output<Boolean> waitingRoomCookieAutomaticSalt;

    public Optional<Output<Boolean>> waitingRoomCookieAutomaticSalt() {
        return Optional.ofNullable(this.waitingRoomCookieAutomaticSalt);
    }

    @Import(name="waitingRoomCookieDomain")
    private @Nullable Output<String> waitingRoomCookieDomain;

    public Optional<Output<String>> waitingRoomCookieDomain() {
        return Optional.ofNullable(this.waitingRoomCookieDomain);
    }

    @Import(name="waitingRoomCookieDomainType")
    private @Nullable Output<String> waitingRoomCookieDomainType;

    public Optional<Output<String>> waitingRoomCookieDomainType() {
        return Optional.ofNullable(this.waitingRoomCookieDomainType);
    }

    @Import(name="waitingRoomCookieDuration")
    private @Nullable Output<Integer> waitingRoomCookieDuration;

    public Optional<Output<Integer>> waitingRoomCookieDuration() {
        return Optional.ofNullable(this.waitingRoomCookieDuration);
    }

    @Import(name="waitingRoomCookieEnabled")
    private @Nullable Output<Boolean> waitingRoomCookieEnabled;

    public Optional<Output<Boolean>> waitingRoomCookieEnabled() {
        return Optional.ofNullable(this.waitingRoomCookieEnabled);
    }

    @Import(name="waitingRoomCookieHttpOnly")
    private @Nullable Output<Boolean> waitingRoomCookieHttpOnly;

    public Optional<Output<Boolean>> waitingRoomCookieHttpOnly() {
        return Optional.ofNullable(this.waitingRoomCookieHttpOnly);
    }

    @Import(name="waitingRoomCookieLabel")
    private @Nullable Output<String> waitingRoomCookieLabel;

    public Optional<Output<String>> waitingRoomCookieLabel() {
        return Optional.ofNullable(this.waitingRoomCookieLabel);
    }

    @Import(name="waitingRoomCookieManagementTitle")
    private @Nullable Output<String> waitingRoomCookieManagementTitle;

    public Optional<Output<String>> waitingRoomCookieManagementTitle() {
        return Optional.ofNullable(this.waitingRoomCookieManagementTitle);
    }

    @Import(name="waitingRoomCookieSalt")
    private @Nullable Output<String> waitingRoomCookieSalt;

    public Optional<Output<String>> waitingRoomCookieSalt() {
        return Optional.ofNullable(this.waitingRoomCookieSalt);
    }

    @Import(name="waitingRoomCookieShareLabel")
    private @Nullable Output<Boolean> waitingRoomCookieShareLabel;

    public Optional<Output<Boolean>> waitingRoomCookieShareLabel() {
        return Optional.ofNullable(this.waitingRoomCookieShareLabel);
    }

    @Import(name="waitingRoomCpCode")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs> waitingRoomCpCode;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs>> waitingRoomCpCode() {
        return Optional.ofNullable(this.waitingRoomCpCode);
    }

    @Import(name="waitingRoomDirectory")
    private @Nullable Output<String> waitingRoomDirectory;

    public Optional<Output<String>> waitingRoomDirectory() {
        return Optional.ofNullable(this.waitingRoomDirectory);
    }

    @Import(name="waitingRoomManagementTitle")
    private @Nullable Output<String> waitingRoomManagementTitle;

    public Optional<Output<String>> waitingRoomManagementTitle() {
        return Optional.ofNullable(this.waitingRoomManagementTitle);
    }

    @Import(name="waitingRoomNetStorage")
    private @Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorageArgs> waitingRoomNetStorage;

    public Optional<Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorageArgs>> waitingRoomNetStorage() {
        return Optional.ofNullable(this.waitingRoomNetStorage);
    }

    @Import(name="waitingRoomStatusCode")
    private @Nullable Output<Integer> waitingRoomStatusCode;

    public Optional<Output<Integer>> waitingRoomStatusCode() {
        return Optional.ofNullable(this.waitingRoomStatusCode);
    }

    @Import(name="waitingRoomUseCpCode")
    private @Nullable Output<Boolean> waitingRoomUseCpCode;

    public Optional<Output<Boolean>> waitingRoomUseCpCode() {
        return Optional.ofNullable(this.waitingRoomUseCpCode);
    }

    private GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs() {}

    private GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs $) {
        this.allowedUserCookieAdvanced = $.allowedUserCookieAdvanced;
        this.allowedUserCookieAutomaticSalt = $.allowedUserCookieAutomaticSalt;
        this.allowedUserCookieDomain = $.allowedUserCookieDomain;
        this.allowedUserCookieDomainType = $.allowedUserCookieDomainType;
        this.allowedUserCookieDuration = $.allowedUserCookieDuration;
        this.allowedUserCookieEnabled = $.allowedUserCookieEnabled;
        this.allowedUserCookieHttpOnly = $.allowedUserCookieHttpOnly;
        this.allowedUserCookieLabel = $.allowedUserCookieLabel;
        this.allowedUserCookieManagementTitle = $.allowedUserCookieManagementTitle;
        this.allowedUserCookieRefresh = $.allowedUserCookieRefresh;
        this.allowedUserCookieSalt = $.allowedUserCookieSalt;
        this.cloudletPolicy = $.cloudletPolicy;
        this.enabled = $.enabled;
        this.locked = $.locked;
        this.templateUuid = $.templateUuid;
        this.userIdentificationByCookie = $.userIdentificationByCookie;
        this.userIdentificationByHeaders = $.userIdentificationByHeaders;
        this.userIdentificationByIp = $.userIdentificationByIp;
        this.userIdentificationByParams = $.userIdentificationByParams;
        this.userIdentificationKeyCookie = $.userIdentificationKeyCookie;
        this.userIdentificationKeyHeaders = $.userIdentificationKeyHeaders;
        this.userIdentificationKeyParams = $.userIdentificationKeyParams;
        this.userIdentificationTitle = $.userIdentificationTitle;
        this.uuid = $.uuid;
        this.waitingRoomCacheTtl = $.waitingRoomCacheTtl;
        this.waitingRoomCookieAdvanced = $.waitingRoomCookieAdvanced;
        this.waitingRoomCookieAutomaticSalt = $.waitingRoomCookieAutomaticSalt;
        this.waitingRoomCookieDomain = $.waitingRoomCookieDomain;
        this.waitingRoomCookieDomainType = $.waitingRoomCookieDomainType;
        this.waitingRoomCookieDuration = $.waitingRoomCookieDuration;
        this.waitingRoomCookieEnabled = $.waitingRoomCookieEnabled;
        this.waitingRoomCookieHttpOnly = $.waitingRoomCookieHttpOnly;
        this.waitingRoomCookieLabel = $.waitingRoomCookieLabel;
        this.waitingRoomCookieManagementTitle = $.waitingRoomCookieManagementTitle;
        this.waitingRoomCookieSalt = $.waitingRoomCookieSalt;
        this.waitingRoomCookieShareLabel = $.waitingRoomCookieShareLabel;
        this.waitingRoomCpCode = $.waitingRoomCpCode;
        this.waitingRoomDirectory = $.waitingRoomDirectory;
        this.waitingRoomManagementTitle = $.waitingRoomManagementTitle;
        this.waitingRoomNetStorage = $.waitingRoomNetStorage;
        this.waitingRoomStatusCode = $.waitingRoomStatusCode;
        this.waitingRoomUseCpCode = $.waitingRoomUseCpCode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs $;

        public Builder() {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs();
        }

        public Builder(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs defaults) {
            $ = new GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder allowedUserCookieAdvanced(@Nullable Output<Boolean> allowedUserCookieAdvanced) {
            $.allowedUserCookieAdvanced = allowedUserCookieAdvanced;
            return this;
        }

        public Builder allowedUserCookieAdvanced(Boolean allowedUserCookieAdvanced) {
            return allowedUserCookieAdvanced(Output.of(allowedUserCookieAdvanced));
        }

        public Builder allowedUserCookieAutomaticSalt(@Nullable Output<Boolean> allowedUserCookieAutomaticSalt) {
            $.allowedUserCookieAutomaticSalt = allowedUserCookieAutomaticSalt;
            return this;
        }

        public Builder allowedUserCookieAutomaticSalt(Boolean allowedUserCookieAutomaticSalt) {
            return allowedUserCookieAutomaticSalt(Output.of(allowedUserCookieAutomaticSalt));
        }

        public Builder allowedUserCookieDomain(@Nullable Output<String> allowedUserCookieDomain) {
            $.allowedUserCookieDomain = allowedUserCookieDomain;
            return this;
        }

        public Builder allowedUserCookieDomain(String allowedUserCookieDomain) {
            return allowedUserCookieDomain(Output.of(allowedUserCookieDomain));
        }

        public Builder allowedUserCookieDomainType(@Nullable Output<String> allowedUserCookieDomainType) {
            $.allowedUserCookieDomainType = allowedUserCookieDomainType;
            return this;
        }

        public Builder allowedUserCookieDomainType(String allowedUserCookieDomainType) {
            return allowedUserCookieDomainType(Output.of(allowedUserCookieDomainType));
        }

        public Builder allowedUserCookieDuration(@Nullable Output<Integer> allowedUserCookieDuration) {
            $.allowedUserCookieDuration = allowedUserCookieDuration;
            return this;
        }

        public Builder allowedUserCookieDuration(Integer allowedUserCookieDuration) {
            return allowedUserCookieDuration(Output.of(allowedUserCookieDuration));
        }

        public Builder allowedUserCookieEnabled(@Nullable Output<Boolean> allowedUserCookieEnabled) {
            $.allowedUserCookieEnabled = allowedUserCookieEnabled;
            return this;
        }

        public Builder allowedUserCookieEnabled(Boolean allowedUserCookieEnabled) {
            return allowedUserCookieEnabled(Output.of(allowedUserCookieEnabled));
        }

        public Builder allowedUserCookieHttpOnly(@Nullable Output<Boolean> allowedUserCookieHttpOnly) {
            $.allowedUserCookieHttpOnly = allowedUserCookieHttpOnly;
            return this;
        }

        public Builder allowedUserCookieHttpOnly(Boolean allowedUserCookieHttpOnly) {
            return allowedUserCookieHttpOnly(Output.of(allowedUserCookieHttpOnly));
        }

        public Builder allowedUserCookieLabel(@Nullable Output<String> allowedUserCookieLabel) {
            $.allowedUserCookieLabel = allowedUserCookieLabel;
            return this;
        }

        public Builder allowedUserCookieLabel(String allowedUserCookieLabel) {
            return allowedUserCookieLabel(Output.of(allowedUserCookieLabel));
        }

        public Builder allowedUserCookieManagementTitle(@Nullable Output<String> allowedUserCookieManagementTitle) {
            $.allowedUserCookieManagementTitle = allowedUserCookieManagementTitle;
            return this;
        }

        public Builder allowedUserCookieManagementTitle(String allowedUserCookieManagementTitle) {
            return allowedUserCookieManagementTitle(Output.of(allowedUserCookieManagementTitle));
        }

        public Builder allowedUserCookieRefresh(@Nullable Output<Boolean> allowedUserCookieRefresh) {
            $.allowedUserCookieRefresh = allowedUserCookieRefresh;
            return this;
        }

        public Builder allowedUserCookieRefresh(Boolean allowedUserCookieRefresh) {
            return allowedUserCookieRefresh(Output.of(allowedUserCookieRefresh));
        }

        public Builder allowedUserCookieSalt(@Nullable Output<String> allowedUserCookieSalt) {
            $.allowedUserCookieSalt = allowedUserCookieSalt;
            return this;
        }

        public Builder allowedUserCookieSalt(String allowedUserCookieSalt) {
            return allowedUserCookieSalt(Output.of(allowedUserCookieSalt));
        }

        public Builder cloudletPolicy(@Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicyArgs> cloudletPolicy) {
            $.cloudletPolicy = cloudletPolicy;
            return this;
        }

        public Builder cloudletPolicy(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationCloudletPolicyArgs cloudletPolicy) {
            return cloudletPolicy(Output.of(cloudletPolicy));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        public Builder templateUuid(@Nullable Output<String> templateUuid) {
            $.templateUuid = templateUuid;
            return this;
        }

        public Builder templateUuid(String templateUuid) {
            return templateUuid(Output.of(templateUuid));
        }

        public Builder userIdentificationByCookie(@Nullable Output<Boolean> userIdentificationByCookie) {
            $.userIdentificationByCookie = userIdentificationByCookie;
            return this;
        }

        public Builder userIdentificationByCookie(Boolean userIdentificationByCookie) {
            return userIdentificationByCookie(Output.of(userIdentificationByCookie));
        }

        public Builder userIdentificationByHeaders(@Nullable Output<Boolean> userIdentificationByHeaders) {
            $.userIdentificationByHeaders = userIdentificationByHeaders;
            return this;
        }

        public Builder userIdentificationByHeaders(Boolean userIdentificationByHeaders) {
            return userIdentificationByHeaders(Output.of(userIdentificationByHeaders));
        }

        public Builder userIdentificationByIp(@Nullable Output<Boolean> userIdentificationByIp) {
            $.userIdentificationByIp = userIdentificationByIp;
            return this;
        }

        public Builder userIdentificationByIp(Boolean userIdentificationByIp) {
            return userIdentificationByIp(Output.of(userIdentificationByIp));
        }

        public Builder userIdentificationByParams(@Nullable Output<Boolean> userIdentificationByParams) {
            $.userIdentificationByParams = userIdentificationByParams;
            return this;
        }

        public Builder userIdentificationByParams(Boolean userIdentificationByParams) {
            return userIdentificationByParams(Output.of(userIdentificationByParams));
        }

        public Builder userIdentificationKeyCookie(@Nullable Output<String> userIdentificationKeyCookie) {
            $.userIdentificationKeyCookie = userIdentificationKeyCookie;
            return this;
        }

        public Builder userIdentificationKeyCookie(String userIdentificationKeyCookie) {
            return userIdentificationKeyCookie(Output.of(userIdentificationKeyCookie));
        }

        public Builder userIdentificationKeyHeaders(@Nullable Output<List<String>> userIdentificationKeyHeaders) {
            $.userIdentificationKeyHeaders = userIdentificationKeyHeaders;
            return this;
        }

        public Builder userIdentificationKeyHeaders(List<String> userIdentificationKeyHeaders) {
            return userIdentificationKeyHeaders(Output.of(userIdentificationKeyHeaders));
        }

        public Builder userIdentificationKeyHeaders(String... userIdentificationKeyHeaders) {
            return userIdentificationKeyHeaders(List.of(userIdentificationKeyHeaders));
        }

        public Builder userIdentificationKeyParams(@Nullable Output<List<String>> userIdentificationKeyParams) {
            $.userIdentificationKeyParams = userIdentificationKeyParams;
            return this;
        }

        public Builder userIdentificationKeyParams(List<String> userIdentificationKeyParams) {
            return userIdentificationKeyParams(Output.of(userIdentificationKeyParams));
        }

        public Builder userIdentificationKeyParams(String... userIdentificationKeyParams) {
            return userIdentificationKeyParams(List.of(userIdentificationKeyParams));
        }

        public Builder userIdentificationTitle(@Nullable Output<String> userIdentificationTitle) {
            $.userIdentificationTitle = userIdentificationTitle;
            return this;
        }

        public Builder userIdentificationTitle(String userIdentificationTitle) {
            return userIdentificationTitle(Output.of(userIdentificationTitle));
        }

        public Builder uuid(@Nullable Output<String> uuid) {
            $.uuid = uuid;
            return this;
        }

        public Builder uuid(String uuid) {
            return uuid(Output.of(uuid));
        }

        public Builder waitingRoomCacheTtl(@Nullable Output<Integer> waitingRoomCacheTtl) {
            $.waitingRoomCacheTtl = waitingRoomCacheTtl;
            return this;
        }

        public Builder waitingRoomCacheTtl(Integer waitingRoomCacheTtl) {
            return waitingRoomCacheTtl(Output.of(waitingRoomCacheTtl));
        }

        public Builder waitingRoomCookieAdvanced(@Nullable Output<Boolean> waitingRoomCookieAdvanced) {
            $.waitingRoomCookieAdvanced = waitingRoomCookieAdvanced;
            return this;
        }

        public Builder waitingRoomCookieAdvanced(Boolean waitingRoomCookieAdvanced) {
            return waitingRoomCookieAdvanced(Output.of(waitingRoomCookieAdvanced));
        }

        public Builder waitingRoomCookieAutomaticSalt(@Nullable Output<Boolean> waitingRoomCookieAutomaticSalt) {
            $.waitingRoomCookieAutomaticSalt = waitingRoomCookieAutomaticSalt;
            return this;
        }

        public Builder waitingRoomCookieAutomaticSalt(Boolean waitingRoomCookieAutomaticSalt) {
            return waitingRoomCookieAutomaticSalt(Output.of(waitingRoomCookieAutomaticSalt));
        }

        public Builder waitingRoomCookieDomain(@Nullable Output<String> waitingRoomCookieDomain) {
            $.waitingRoomCookieDomain = waitingRoomCookieDomain;
            return this;
        }

        public Builder waitingRoomCookieDomain(String waitingRoomCookieDomain) {
            return waitingRoomCookieDomain(Output.of(waitingRoomCookieDomain));
        }

        public Builder waitingRoomCookieDomainType(@Nullable Output<String> waitingRoomCookieDomainType) {
            $.waitingRoomCookieDomainType = waitingRoomCookieDomainType;
            return this;
        }

        public Builder waitingRoomCookieDomainType(String waitingRoomCookieDomainType) {
            return waitingRoomCookieDomainType(Output.of(waitingRoomCookieDomainType));
        }

        public Builder waitingRoomCookieDuration(@Nullable Output<Integer> waitingRoomCookieDuration) {
            $.waitingRoomCookieDuration = waitingRoomCookieDuration;
            return this;
        }

        public Builder waitingRoomCookieDuration(Integer waitingRoomCookieDuration) {
            return waitingRoomCookieDuration(Output.of(waitingRoomCookieDuration));
        }

        public Builder waitingRoomCookieEnabled(@Nullable Output<Boolean> waitingRoomCookieEnabled) {
            $.waitingRoomCookieEnabled = waitingRoomCookieEnabled;
            return this;
        }

        public Builder waitingRoomCookieEnabled(Boolean waitingRoomCookieEnabled) {
            return waitingRoomCookieEnabled(Output.of(waitingRoomCookieEnabled));
        }

        public Builder waitingRoomCookieHttpOnly(@Nullable Output<Boolean> waitingRoomCookieHttpOnly) {
            $.waitingRoomCookieHttpOnly = waitingRoomCookieHttpOnly;
            return this;
        }

        public Builder waitingRoomCookieHttpOnly(Boolean waitingRoomCookieHttpOnly) {
            return waitingRoomCookieHttpOnly(Output.of(waitingRoomCookieHttpOnly));
        }

        public Builder waitingRoomCookieLabel(@Nullable Output<String> waitingRoomCookieLabel) {
            $.waitingRoomCookieLabel = waitingRoomCookieLabel;
            return this;
        }

        public Builder waitingRoomCookieLabel(String waitingRoomCookieLabel) {
            return waitingRoomCookieLabel(Output.of(waitingRoomCookieLabel));
        }

        public Builder waitingRoomCookieManagementTitle(@Nullable Output<String> waitingRoomCookieManagementTitle) {
            $.waitingRoomCookieManagementTitle = waitingRoomCookieManagementTitle;
            return this;
        }

        public Builder waitingRoomCookieManagementTitle(String waitingRoomCookieManagementTitle) {
            return waitingRoomCookieManagementTitle(Output.of(waitingRoomCookieManagementTitle));
        }

        public Builder waitingRoomCookieSalt(@Nullable Output<String> waitingRoomCookieSalt) {
            $.waitingRoomCookieSalt = waitingRoomCookieSalt;
            return this;
        }

        public Builder waitingRoomCookieSalt(String waitingRoomCookieSalt) {
            return waitingRoomCookieSalt(Output.of(waitingRoomCookieSalt));
        }

        public Builder waitingRoomCookieShareLabel(@Nullable Output<Boolean> waitingRoomCookieShareLabel) {
            $.waitingRoomCookieShareLabel = waitingRoomCookieShareLabel;
            return this;
        }

        public Builder waitingRoomCookieShareLabel(Boolean waitingRoomCookieShareLabel) {
            return waitingRoomCookieShareLabel(Output.of(waitingRoomCookieShareLabel));
        }

        public Builder waitingRoomCpCode(@Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs> waitingRoomCpCode) {
            $.waitingRoomCpCode = waitingRoomCpCode;
            return this;
        }

        public Builder waitingRoomCpCode(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomCpCodeArgs waitingRoomCpCode) {
            return waitingRoomCpCode(Output.of(waitingRoomCpCode));
        }

        public Builder waitingRoomDirectory(@Nullable Output<String> waitingRoomDirectory) {
            $.waitingRoomDirectory = waitingRoomDirectory;
            return this;
        }

        public Builder waitingRoomDirectory(String waitingRoomDirectory) {
            return waitingRoomDirectory(Output.of(waitingRoomDirectory));
        }

        public Builder waitingRoomManagementTitle(@Nullable Output<String> waitingRoomManagementTitle) {
            $.waitingRoomManagementTitle = waitingRoomManagementTitle;
            return this;
        }

        public Builder waitingRoomManagementTitle(String waitingRoomManagementTitle) {
            return waitingRoomManagementTitle(Output.of(waitingRoomManagementTitle));
        }

        public Builder waitingRoomNetStorage(@Nullable Output<GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorageArgs> waitingRoomNetStorage) {
            $.waitingRoomNetStorage = waitingRoomNetStorage;
            return this;
        }

        public Builder waitingRoomNetStorage(GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationWaitingRoomNetStorageArgs waitingRoomNetStorage) {
            return waitingRoomNetStorage(Output.of(waitingRoomNetStorage));
        }

        public Builder waitingRoomStatusCode(@Nullable Output<Integer> waitingRoomStatusCode) {
            $.waitingRoomStatusCode = waitingRoomStatusCode;
            return this;
        }

        public Builder waitingRoomStatusCode(Integer waitingRoomStatusCode) {
            return waitingRoomStatusCode(Output.of(waitingRoomStatusCode));
        }

        public Builder waitingRoomUseCpCode(@Nullable Output<Boolean> waitingRoomUseCpCode) {
            $.waitingRoomUseCpCode = waitingRoomUseCpCode;
            return this;
        }

        public Builder waitingRoomUseCpCode(Boolean waitingRoomUseCpCode) {
            return waitingRoomUseCpCode(Output.of(waitingRoomUseCpCode));
        }

        public GetPropertyRulesBuilderRulesV20230105BehaviorVisitorPrioritizationArgs build() {
            return $;
        }
    }

}