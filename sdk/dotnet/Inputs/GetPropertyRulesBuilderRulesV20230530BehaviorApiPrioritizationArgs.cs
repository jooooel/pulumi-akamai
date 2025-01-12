// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("alternateResponseCacheTtl")]
        public Input<int>? AlternateResponseCacheTtl { get; set; }

        [Input("cloudletPolicy")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationCloudletPolicyInputArgs>? CloudletPolicy { get; set; }

        [Input("cloudletSharedPolicy")]
        public Input<int>? CloudletSharedPolicy { get; set; }

        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("isSharedPolicy")]
        public Input<bool>? IsSharedPolicy { get; set; }

        [Input("label")]
        public Input<string>? Label { get; set; }

        [Input("locked")]
        public Input<bool>? Locked { get; set; }

        [Input("netStorage")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationNetStorageInputArgs>? NetStorage { get; set; }

        [Input("netStoragePath")]
        public Input<string>? NetStoragePath { get; set; }

        [Input("templateUuid")]
        public Input<string>? TemplateUuid { get; set; }

        [Input("throttledCpCode")]
        public Input<Inputs.GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationThrottledCpCodeInputArgs>? ThrottledCpCode { get; set; }

        [Input("throttledStatusCode")]
        public Input<int>? ThrottledStatusCode { get; set; }

        [Input("useThrottledCpCode")]
        public Input<bool>? UseThrottledCpCode { get; set; }

        [Input("useThrottledStatusCode")]
        public Input<bool>? UseThrottledStatusCode { get; set; }

        [Input("uuid")]
        public Input<string>? Uuid { get; set; }

        public GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationInputArgs()
        {
        }
        public static new GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationInputArgs Empty => new GetPropertyRulesBuilderRulesV20230530BehaviorApiPrioritizationInputArgs();
    }
}
