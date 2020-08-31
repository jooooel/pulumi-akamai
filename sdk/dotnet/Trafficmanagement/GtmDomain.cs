// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Trafficmanagement
{
    /// <summary>
    /// `akamai.trafficmanagement.GtmDomain` provides the resource for creating, configuring and importing a gtm domain to integrate easily with your existing GTM infrastructure to provide a secure, high performance, highly available and scalable solution for Global Traffic Management. Note: Import requires an ID of the format: `existing_domain_name`
    /// 
    /// ## Example Usage
    /// ### Basic usage:
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Akamai = Pulumi.Akamai;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var demodomain = new Akamai.Trafficmanagement.GtmDomain("demodomain", new Akamai.Trafficmanagement.GtmDomainArgs
    ///         {
    ///             Comment = "some comment",
    ///             Contract = "XXX",
    ///             Group = "100",
    ///             Type = "basic",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// </summary>
    public partial class GtmDomain : Pulumi.CustomResource
    {
        /// <summary>
        /// — (Boolean)
        /// </summary>
        [Output("cnameCoalescingEnabled")]
        public Output<bool?> CnameCoalescingEnabled { get; private set; } = null!;

        /// <summary>
        /// — A descriptive comment
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// — The contract ID (if creating domain)
        /// </summary>
        [Output("contract")]
        public Output<string?> Contract { get; private set; } = null!;

        /// <summary>
        /// — (Default: 75)
        /// </summary>
        [Output("defaultErrorPenalty")]
        public Output<int?> DefaultErrorPenalty { get; private set; } = null!;

        [Output("defaultHealthMax")]
        public Output<double> DefaultHealthMax { get; private set; } = null!;

        [Output("defaultHealthMultiplier")]
        public Output<double> DefaultHealthMultiplier { get; private set; } = null!;

        [Output("defaultHealthThreshold")]
        public Output<double> DefaultHealthThreshold { get; private set; } = null!;

        [Output("defaultMaxUnreachablePenalty")]
        public Output<int> DefaultMaxUnreachablePenalty { get; private set; } = null!;

        [Output("defaultSslClientCertificate")]
        public Output<string?> DefaultSslClientCertificate { get; private set; } = null!;

        [Output("defaultSslClientPrivateKey")]
        public Output<string?> DefaultSslClientPrivateKey { get; private set; } = null!;

        /// <summary>
        /// — (Default: 25)
        /// * `load_imbalance_percentage`
        /// * `default_ssl_client_private_key`
        /// </summary>
        [Output("defaultTimeoutPenalty")]
        public Output<int?> DefaultTimeoutPenalty { get; private set; } = null!;

        /// <summary>
        /// * `min_pingable_region_fraction`
        /// * `servermonitor_liveness_count`
        /// * `round_robin_prefix`
        /// * `servermonitor_load_count`
        /// * `ping_interval`
        /// * `max_ttl`
        /// * `default_health_max`
        /// * `map_update_interval`
        /// * `max_properties`
        /// * `max_resources`
        /// * `default_error_penalty`
        /// * `max_test_timeout`
        /// * `default_health_multiplier`
        /// * `servermonitor_pool`
        /// * `min_ttl`
        /// * `default_max_unreachable_penalty`
        /// * `default_health_threshold`
        /// * `min_test_interval`
        /// * `ping_packet_size`
        /// </summary>
        [Output("defaultUnreachableThreshold")]
        public Output<double> DefaultUnreachableThreshold { get; private set; } = null!;

        /// <summary>
        /// — (List)
        /// </summary>
        [Output("emailNotificationLists")]
        public Output<ImmutableArray<string>> EmailNotificationLists { get; private set; } = null!;

        /// <summary>
        /// — (Boolean)
        /// </summary>
        [Output("endUserMappingEnabled")]
        public Output<bool?> EndUserMappingEnabled { get; private set; } = null!;

        /// <summary>
        /// — The currently selected group ID (if creating domain)
        /// </summary>
        [Output("group")]
        public Output<string?> Group { get; private set; } = null!;

        /// <summary>
        /// — (Boolean)
        /// * `default_ssl_client_certificate`
        /// </summary>
        [Output("loadFeedback")]
        public Output<bool?> LoadFeedback { get; private set; } = null!;

        [Output("loadImbalancePercentage")]
        public Output<double?> LoadImbalancePercentage { get; private set; } = null!;

        [Output("mapUpdateInterval")]
        public Output<int> MapUpdateInterval { get; private set; } = null!;

        [Output("maxProperties")]
        public Output<int> MaxProperties { get; private set; } = null!;

        [Output("maxResources")]
        public Output<int> MaxResources { get; private set; } = null!;

        [Output("maxTestTimeout")]
        public Output<double> MaxTestTimeout { get; private set; } = null!;

        [Output("maxTtl")]
        public Output<int> MaxTtl { get; private set; } = null!;

        [Output("minPingableRegionFraction")]
        public Output<double> MinPingableRegionFraction { get; private set; } = null!;

        [Output("minTestInterval")]
        public Output<int> MinTestInterval { get; private set; } = null!;

        [Output("minTtl")]
        public Output<int> MinTtl { get; private set; } = null!;

        /// <summary>
        /// — Domain name
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("pingInterval")]
        public Output<int> PingInterval { get; private set; } = null!;

        [Output("pingPacketSize")]
        public Output<int> PingPacketSize { get; private set; } = null!;

        [Output("roundRobinPrefix")]
        public Output<string> RoundRobinPrefix { get; private set; } = null!;

        [Output("servermonitorLivenessCount")]
        public Output<int> ServermonitorLivenessCount { get; private set; } = null!;

        [Output("servermonitorLoadCount")]
        public Output<int> ServermonitorLoadCount { get; private set; } = null!;

        [Output("servermonitorPool")]
        public Output<string> ServermonitorPool { get; private set; } = null!;

        /// <summary>
        /// — Domain type
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// — (Boolean, Default: true) Wait for transaction to complete
        /// </summary>
        [Output("waitOnComplete")]
        public Output<bool?> WaitOnComplete { get; private set; } = null!;


        /// <summary>
        /// Create a GtmDomain resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GtmDomain(string name, GtmDomainArgs args, CustomResourceOptions? options = null)
            : base("akamai:trafficmanagement/gtmDomain:GtmDomain", name, args ?? new GtmDomainArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GtmDomain(string name, Input<string> id, GtmDomainState? state = null, CustomResourceOptions? options = null)
            : base("akamai:trafficmanagement/gtmDomain:GtmDomain", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing GtmDomain resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GtmDomain Get(string name, Input<string> id, GtmDomainState? state = null, CustomResourceOptions? options = null)
        {
            return new GtmDomain(name, id, state, options);
        }
    }

    public sealed class GtmDomainArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// — (Boolean)
        /// </summary>
        [Input("cnameCoalescingEnabled")]
        public Input<bool>? CnameCoalescingEnabled { get; set; }

        /// <summary>
        /// — A descriptive comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// — The contract ID (if creating domain)
        /// </summary>
        [Input("contract")]
        public Input<string>? Contract { get; set; }

        /// <summary>
        /// — (Default: 75)
        /// </summary>
        [Input("defaultErrorPenalty")]
        public Input<int>? DefaultErrorPenalty { get; set; }

        [Input("defaultSslClientCertificate")]
        public Input<string>? DefaultSslClientCertificate { get; set; }

        [Input("defaultSslClientPrivateKey")]
        public Input<string>? DefaultSslClientPrivateKey { get; set; }

        /// <summary>
        /// — (Default: 25)
        /// * `load_imbalance_percentage`
        /// * `default_ssl_client_private_key`
        /// </summary>
        [Input("defaultTimeoutPenalty")]
        public Input<int>? DefaultTimeoutPenalty { get; set; }

        [Input("emailNotificationLists")]
        private InputList<string>? _emailNotificationLists;

        /// <summary>
        /// — (List)
        /// </summary>
        public InputList<string> EmailNotificationLists
        {
            get => _emailNotificationLists ?? (_emailNotificationLists = new InputList<string>());
            set => _emailNotificationLists = value;
        }

        /// <summary>
        /// — (Boolean)
        /// </summary>
        [Input("endUserMappingEnabled")]
        public Input<bool>? EndUserMappingEnabled { get; set; }

        /// <summary>
        /// — The currently selected group ID (if creating domain)
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// — (Boolean)
        /// * `default_ssl_client_certificate`
        /// </summary>
        [Input("loadFeedback")]
        public Input<bool>? LoadFeedback { get; set; }

        [Input("loadImbalancePercentage")]
        public Input<double>? LoadImbalancePercentage { get; set; }

        /// <summary>
        /// — Domain name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// — Domain type
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// — (Boolean, Default: true) Wait for transaction to complete
        /// </summary>
        [Input("waitOnComplete")]
        public Input<bool>? WaitOnComplete { get; set; }

        public GtmDomainArgs()
        {
        }
    }

    public sealed class GtmDomainState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// — (Boolean)
        /// </summary>
        [Input("cnameCoalescingEnabled")]
        public Input<bool>? CnameCoalescingEnabled { get; set; }

        /// <summary>
        /// — A descriptive comment
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// — The contract ID (if creating domain)
        /// </summary>
        [Input("contract")]
        public Input<string>? Contract { get; set; }

        /// <summary>
        /// — (Default: 75)
        /// </summary>
        [Input("defaultErrorPenalty")]
        public Input<int>? DefaultErrorPenalty { get; set; }

        [Input("defaultHealthMax")]
        public Input<double>? DefaultHealthMax { get; set; }

        [Input("defaultHealthMultiplier")]
        public Input<double>? DefaultHealthMultiplier { get; set; }

        [Input("defaultHealthThreshold")]
        public Input<double>? DefaultHealthThreshold { get; set; }

        [Input("defaultMaxUnreachablePenalty")]
        public Input<int>? DefaultMaxUnreachablePenalty { get; set; }

        [Input("defaultSslClientCertificate")]
        public Input<string>? DefaultSslClientCertificate { get; set; }

        [Input("defaultSslClientPrivateKey")]
        public Input<string>? DefaultSslClientPrivateKey { get; set; }

        /// <summary>
        /// — (Default: 25)
        /// * `load_imbalance_percentage`
        /// * `default_ssl_client_private_key`
        /// </summary>
        [Input("defaultTimeoutPenalty")]
        public Input<int>? DefaultTimeoutPenalty { get; set; }

        /// <summary>
        /// * `min_pingable_region_fraction`
        /// * `servermonitor_liveness_count`
        /// * `round_robin_prefix`
        /// * `servermonitor_load_count`
        /// * `ping_interval`
        /// * `max_ttl`
        /// * `default_health_max`
        /// * `map_update_interval`
        /// * `max_properties`
        /// * `max_resources`
        /// * `default_error_penalty`
        /// * `max_test_timeout`
        /// * `default_health_multiplier`
        /// * `servermonitor_pool`
        /// * `min_ttl`
        /// * `default_max_unreachable_penalty`
        /// * `default_health_threshold`
        /// * `min_test_interval`
        /// * `ping_packet_size`
        /// </summary>
        [Input("defaultUnreachableThreshold")]
        public Input<double>? DefaultUnreachableThreshold { get; set; }

        [Input("emailNotificationLists")]
        private InputList<string>? _emailNotificationLists;

        /// <summary>
        /// — (List)
        /// </summary>
        public InputList<string> EmailNotificationLists
        {
            get => _emailNotificationLists ?? (_emailNotificationLists = new InputList<string>());
            set => _emailNotificationLists = value;
        }

        /// <summary>
        /// — (Boolean)
        /// </summary>
        [Input("endUserMappingEnabled")]
        public Input<bool>? EndUserMappingEnabled { get; set; }

        /// <summary>
        /// — The currently selected group ID (if creating domain)
        /// </summary>
        [Input("group")]
        public Input<string>? Group { get; set; }

        /// <summary>
        /// — (Boolean)
        /// * `default_ssl_client_certificate`
        /// </summary>
        [Input("loadFeedback")]
        public Input<bool>? LoadFeedback { get; set; }

        [Input("loadImbalancePercentage")]
        public Input<double>? LoadImbalancePercentage { get; set; }

        [Input("mapUpdateInterval")]
        public Input<int>? MapUpdateInterval { get; set; }

        [Input("maxProperties")]
        public Input<int>? MaxProperties { get; set; }

        [Input("maxResources")]
        public Input<int>? MaxResources { get; set; }

        [Input("maxTestTimeout")]
        public Input<double>? MaxTestTimeout { get; set; }

        [Input("maxTtl")]
        public Input<int>? MaxTtl { get; set; }

        [Input("minPingableRegionFraction")]
        public Input<double>? MinPingableRegionFraction { get; set; }

        [Input("minTestInterval")]
        public Input<int>? MinTestInterval { get; set; }

        [Input("minTtl")]
        public Input<int>? MinTtl { get; set; }

        /// <summary>
        /// — Domain name
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("pingInterval")]
        public Input<int>? PingInterval { get; set; }

        [Input("pingPacketSize")]
        public Input<int>? PingPacketSize { get; set; }

        [Input("roundRobinPrefix")]
        public Input<string>? RoundRobinPrefix { get; set; }

        [Input("servermonitorLivenessCount")]
        public Input<int>? ServermonitorLivenessCount { get; set; }

        [Input("servermonitorLoadCount")]
        public Input<int>? ServermonitorLoadCount { get; set; }

        [Input("servermonitorPool")]
        public Input<string>? ServermonitorPool { get; set; }

        /// <summary>
        /// — Domain type
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// — (Boolean, Default: true) Wait for transaction to complete
        /// </summary>
        [Input("waitOnComplete")]
        public Input<bool>? WaitOnComplete { get; set; }

        public GtmDomainState()
        {
        }
    }
}