// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230105BehaviorDatastreamArgs : global::Pulumi.InvokeArgs
    {
        [Input("beaconStreamTitle")]
        public string? BeaconStreamTitle { get; set; }

        [Input("collectMidgressTraffic")]
        public bool? CollectMidgressTraffic { get; set; }

        [Input("datastreamIds")]
        public string? DatastreamIds { get; set; }

        [Input("enabled")]
        public bool? Enabled { get; set; }

        [Input("locked")]
        public bool? Locked { get; set; }

        [Input("logEnabled")]
        public bool? LogEnabled { get; set; }

        [Input("logStreamName")]
        public int? LogStreamName { get; set; }

        [Input("logStreamTitle")]
        public string? LogStreamTitle { get; set; }

        [Input("samplingPercentage")]
        public int? SamplingPercentage { get; set; }

        [Input("streamType")]
        public string? StreamType { get; set; }

        [Input("templateUuid")]
        public string? TemplateUuid { get; set; }

        [Input("uuid")]
        public string? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230105BehaviorDatastreamArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230105BehaviorDatastreamArgs Empty => new GetPropertyRulesBuilderRulesV20230105BehaviorDatastreamArgs();
    }
}