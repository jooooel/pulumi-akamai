// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.akamai.inputs.GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs Empty = new GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs();

    /**
     * (Optional) Whether to disable a rule so it is not evaluated against incoming requests.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return (Optional) Whether to disable a rule so it is not evaluated against incoming requests.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * (Optional) The end time for this match. Specify the value in UTC in seconds since the epoch.
     * 
     */
    @Import(name="end")
    private @Nullable Output<Integer> end;

    /**
     * @return (Optional) The end time for this match. Specify the value in UTC in seconds since the epoch.
     * 
     */
    public Optional<Output<Integer>> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * (Optional) If you&#39;re using a URL match, this specifies the URL that the Cloudlet uses to match the incoming request.
     * 
     */
    @Import(name="matchUrl")
    private @Nullable Output<String> matchUrl;

    /**
     * @return (Optional) If you&#39;re using a URL match, this specifies the URL that the Cloudlet uses to match the incoming request.
     * 
     */
    public Optional<Output<String>> matchUrl() {
        return Optional.ofNullable(this.matchUrl);
    }

    /**
     * (Optional) A list of conditions to apply to a Cloudlet, including:
     * 
     */
    @Import(name="matches")
    private @Nullable Output<List<GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchArgs>> matches;

    /**
     * @return (Optional) A list of conditions to apply to a Cloudlet, including:
     * 
     */
    public Optional<Output<List<GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchArgs>>> matches() {
        return Optional.ofNullable(this.matches);
    }

    /**
     * (Optional) If you&#39;re using a `match_type` that supports name attributes, specify the part the incoming request to match on, either `cookie`, `header`, `parameter`, or `query`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return (Optional) If you&#39;re using a `match_type` that supports name attributes, specify the part the incoming request to match on, either `cookie`, `header`, `parameter`, or `query`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Required) The URL Edge Redirector redirects the request to. If you&#39;re using `use_relative_url`, you can enter a path for the value.
     * 
     */
    @Import(name="redirectUrl", required=true)
    private Output<String> redirectUrl;

    /**
     * @return (Required) The URL Edge Redirector redirects the request to. If you&#39;re using `use_relative_url`, you can enter a path for the value.
     * 
     */
    public Output<String> redirectUrl() {
        return this.redirectUrl;
    }

    /**
     * (Optional) The start time for this match. Specify the value in UTC in seconds since the epoch.
     * 
     */
    @Import(name="start")
    private @Nullable Output<Integer> start;

    /**
     * @return (Optional) The start time for this match. Specify the value in UTC in seconds since the epoch.
     * 
     */
    public Optional<Output<Integer>> start() {
        return Optional.ofNullable(this.start);
    }

    /**
     * (Required) The HTTP response status code, which is either `301` (permanent redirect) or `302` (temporary redirect).
     * 
     */
    @Import(name="statusCode", required=true)
    private Output<Integer> statusCode;

    /**
     * @return (Required) The HTTP response status code, which is either `301` (permanent redirect) or `302` (temporary redirect).
     * 
     */
    public Output<Integer> statusCode() {
        return this.statusCode;
    }

    /**
     * (Required) The type of the array, either `object` or `simple`. Use the `simple` option when adding only an array of string-based values.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return (Required) The type of the array, either `object` or `simple`. Use the `simple` option when adding only an array of string-based values.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * (Optional) Whether the Cloudlet should include the query string from the request in the rewritten or forwarded URL.
     * 
     */
    @Import(name="useIncomingQueryString")
    private @Nullable Output<Boolean> useIncomingQueryString;

    /**
     * @return (Optional) Whether the Cloudlet should include the query string from the request in the rewritten or forwarded URL.
     * 
     */
    public Optional<Output<Boolean>> useIncomingQueryString() {
        return Optional.ofNullable(this.useIncomingQueryString);
    }

    /**
     * (Optional) If set to `relative_url`, takes the path you specify in the `redirect_url` argument and sets it in the response’s Location header. The client or browser receiving the request decides which protocol and hostname to use. If set to `copy_scheme_hostname`, creates an absolute path by taking the protocol and hostname from the incoming request and combining them with path information you specify in the `redirect_url` argument. This absolute path is set in the response’s Location header. If you do not specify use_relative_url or set to `none`, then specify the `redirect_url` argument as a fully-qualified URL.
     * 
     */
    @Import(name="useRelativeUrl")
    private @Nullable Output<String> useRelativeUrl;

    /**
     * @return (Optional) If set to `relative_url`, takes the path you specify in the `redirect_url` argument and sets it in the response’s Location header. The client or browser receiving the request decides which protocol and hostname to use. If set to `copy_scheme_hostname`, creates an absolute path by taking the protocol and hostname from the incoming request and combining them with path information you specify in the `redirect_url` argument. This absolute path is set in the response’s Location header. If you do not specify use_relative_url or set to `none`, then specify the `redirect_url` argument as a fully-qualified URL.
     * 
     */
    public Optional<Output<String>> useRelativeUrl() {
        return Optional.ofNullable(this.useRelativeUrl);
    }

    private GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs() {}

    private GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs(GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs $) {
        this.disabled = $.disabled;
        this.end = $.end;
        this.matchUrl = $.matchUrl;
        this.matches = $.matches;
        this.name = $.name;
        this.redirectUrl = $.redirectUrl;
        this.start = $.start;
        this.statusCode = $.statusCode;
        this.type = $.type;
        this.useIncomingQueryString = $.useIncomingQueryString;
        this.useRelativeUrl = $.useRelativeUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs $;

        public Builder() {
            $ = new GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs();
        }

        public Builder(GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs defaults) {
            $ = new GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled (Optional) Whether to disable a rule so it is not evaluated against incoming requests.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled (Optional) Whether to disable a rule so it is not evaluated against incoming requests.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param end (Optional) The end time for this match. Specify the value in UTC in seconds since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder end(@Nullable Output<Integer> end) {
            $.end = end;
            return this;
        }

        /**
         * @param end (Optional) The end time for this match. Specify the value in UTC in seconds since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder end(Integer end) {
            return end(Output.of(end));
        }

        /**
         * @param matchUrl (Optional) If you&#39;re using a URL match, this specifies the URL that the Cloudlet uses to match the incoming request.
         * 
         * @return builder
         * 
         */
        public Builder matchUrl(@Nullable Output<String> matchUrl) {
            $.matchUrl = matchUrl;
            return this;
        }

        /**
         * @param matchUrl (Optional) If you&#39;re using a URL match, this specifies the URL that the Cloudlet uses to match the incoming request.
         * 
         * @return builder
         * 
         */
        public Builder matchUrl(String matchUrl) {
            return matchUrl(Output.of(matchUrl));
        }

        /**
         * @param matches (Optional) A list of conditions to apply to a Cloudlet, including:
         * 
         * @return builder
         * 
         */
        public Builder matches(@Nullable Output<List<GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchArgs>> matches) {
            $.matches = matches;
            return this;
        }

        /**
         * @param matches (Optional) A list of conditions to apply to a Cloudlet, including:
         * 
         * @return builder
         * 
         */
        public Builder matches(List<GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchArgs> matches) {
            return matches(Output.of(matches));
        }

        /**
         * @param matches (Optional) A list of conditions to apply to a Cloudlet, including:
         * 
         * @return builder
         * 
         */
        public Builder matches(GetCloudletsEdgeRedirectorMatchRuleMatchRuleMatchArgs... matches) {
            return matches(List.of(matches));
        }

        /**
         * @param name (Optional) If you&#39;re using a `match_type` that supports name attributes, specify the part the incoming request to match on, either `cookie`, `header`, `parameter`, or `query`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name (Optional) If you&#39;re using a `match_type` that supports name attributes, specify the part the incoming request to match on, either `cookie`, `header`, `parameter`, or `query`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param redirectUrl (Required) The URL Edge Redirector redirects the request to. If you&#39;re using `use_relative_url`, you can enter a path for the value.
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(Output<String> redirectUrl) {
            $.redirectUrl = redirectUrl;
            return this;
        }

        /**
         * @param redirectUrl (Required) The URL Edge Redirector redirects the request to. If you&#39;re using `use_relative_url`, you can enter a path for the value.
         * 
         * @return builder
         * 
         */
        public Builder redirectUrl(String redirectUrl) {
            return redirectUrl(Output.of(redirectUrl));
        }

        /**
         * @param start (Optional) The start time for this match. Specify the value in UTC in seconds since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder start(@Nullable Output<Integer> start) {
            $.start = start;
            return this;
        }

        /**
         * @param start (Optional) The start time for this match. Specify the value in UTC in seconds since the epoch.
         * 
         * @return builder
         * 
         */
        public Builder start(Integer start) {
            return start(Output.of(start));
        }

        /**
         * @param statusCode (Required) The HTTP response status code, which is either `301` (permanent redirect) or `302` (temporary redirect).
         * 
         * @return builder
         * 
         */
        public Builder statusCode(Output<Integer> statusCode) {
            $.statusCode = statusCode;
            return this;
        }

        /**
         * @param statusCode (Required) The HTTP response status code, which is either `301` (permanent redirect) or `302` (temporary redirect).
         * 
         * @return builder
         * 
         */
        public Builder statusCode(Integer statusCode) {
            return statusCode(Output.of(statusCode));
        }

        /**
         * @param type (Required) The type of the array, either `object` or `simple`. Use the `simple` option when adding only an array of string-based values.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Required) The type of the array, either `object` or `simple`. Use the `simple` option when adding only an array of string-based values.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param useIncomingQueryString (Optional) Whether the Cloudlet should include the query string from the request in the rewritten or forwarded URL.
         * 
         * @return builder
         * 
         */
        public Builder useIncomingQueryString(@Nullable Output<Boolean> useIncomingQueryString) {
            $.useIncomingQueryString = useIncomingQueryString;
            return this;
        }

        /**
         * @param useIncomingQueryString (Optional) Whether the Cloudlet should include the query string from the request in the rewritten or forwarded URL.
         * 
         * @return builder
         * 
         */
        public Builder useIncomingQueryString(Boolean useIncomingQueryString) {
            return useIncomingQueryString(Output.of(useIncomingQueryString));
        }

        /**
         * @param useRelativeUrl (Optional) If set to `relative_url`, takes the path you specify in the `redirect_url` argument and sets it in the response’s Location header. The client or browser receiving the request decides which protocol and hostname to use. If set to `copy_scheme_hostname`, creates an absolute path by taking the protocol and hostname from the incoming request and combining them with path information you specify in the `redirect_url` argument. This absolute path is set in the response’s Location header. If you do not specify use_relative_url or set to `none`, then specify the `redirect_url` argument as a fully-qualified URL.
         * 
         * @return builder
         * 
         */
        public Builder useRelativeUrl(@Nullable Output<String> useRelativeUrl) {
            $.useRelativeUrl = useRelativeUrl;
            return this;
        }

        /**
         * @param useRelativeUrl (Optional) If set to `relative_url`, takes the path you specify in the `redirect_url` argument and sets it in the response’s Location header. The client or browser receiving the request decides which protocol and hostname to use. If set to `copy_scheme_hostname`, creates an absolute path by taking the protocol and hostname from the incoming request and combining them with path information you specify in the `redirect_url` argument. This absolute path is set in the response’s Location header. If you do not specify use_relative_url or set to `none`, then specify the `redirect_url` argument as a fully-qualified URL.
         * 
         * @return builder
         * 
         */
        public Builder useRelativeUrl(String useRelativeUrl) {
            return useRelativeUrl(Output.of(useRelativeUrl));
        }

        public GetCloudletsEdgeRedirectorMatchRuleMatchRuleArgs build() {
            $.redirectUrl = Objects.requireNonNull($.redirectUrl, "expected parameter 'redirectUrl' to be non-null");
            $.statusCode = Objects.requireNonNull($.statusCode, "expected parameter 'statusCode' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}